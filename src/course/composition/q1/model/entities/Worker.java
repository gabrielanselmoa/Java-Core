package course.composition.q1.model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {}

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment(){
        return this.department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract); 
    }

    public Double income(int month, int year){

        double sum = baseSalary;

        for (HourContract c : contracts){
            Calendar cal = Calendar.getInstance(); // Crie uma nova instância de Calendar para cada contrato
            cal.setTime(c.getDate()); // Defina a data do contrato neste objeto Calendar

            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH) + 1;

            if (c_year == year && c_month == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
    
    public enum WorkerLevel{
        JUNIOR,
        MID_LEVEL,
        SENIOR
    }
}
