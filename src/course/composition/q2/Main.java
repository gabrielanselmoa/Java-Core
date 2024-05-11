package course.composition.q2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("How many posts would like to make?");
        int answer = scan.nextInt();

        System.out.println("Post Data:");
        System.out.println("Enter with the Post's name:");
        String title = scan.nextLine();
        System.out.println("Enter with Post's content:");
        String content = scan.nextLine();
        System.out.println("How many likes the post had?");
        Integer likes = scan.nextInt();
        Date currentDate = new Date();
        String newDate = sdf.format(currentDate);
        Date finalDate = sdf.parse(newDate);

        Post post = new Post(finalDate, title, content, likes);

        System.out.println("How many comments did it has?");
        int nComments = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < nComments; i++) {
            System.out.println("Enter a comment:");
            Comment c = new Comment(scan.nextLine());
            post.addComment(c);
        }

        System.out.println("\nFinal Post Data:\n");
        System.out.println(post.getTitle());
        System.out.println(post.getLikes() + " Likes" + " - " + post.getMoment());
        System.out.println(post.getContent());
        System.out.println("\nComments:");
        for (Comment c : post.commentsList){
            System.out.println("- " + c.getText());
        }

        scan.close();
    }
}
