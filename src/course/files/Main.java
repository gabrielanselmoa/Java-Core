package course.files;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        File path = new File("C:\\Projetos\\Back-End\\Java\\Source.csv");
        String sourcePath = "C:\\Projetos\\Back-End\\Java";
        Product p = null;
        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            String targetPath = sourcePath + "//Out//Summary.csv";
            boolean success = new File(sourcePath + "//Out").mkdir();

            while (line != null){
                System.out.println(line);

                String[] fields = line.split(",");
                String name = fields[0];
                Double price = Double.parseDouble(fields[1]);
                Integer quantity = Integer.parseInt(fields[2]);
                list.add(new Product(name, price, quantity));

                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath))){
                for (Product product : list){
                    bw.write(product.toString());
                    bw.newLine();
                }
            }catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            scan.close();
        }
    }
}
