package course.general.model.entities;

public class Person {

    private String name;
    private int age, ra;
    private boolean subscribed;

    public Person (String name, boolean subscribed){
        this.name = name;
        this.subscribed = subscribed;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean getSubscribed(){
        return this.subscribed;
    }
    public void setSubscribed(boolean subscribed){
        this.subscribed = subscribed;
    }
    public void info() {
        System.out.println("Name: " + this.getName());
        System.out.println("Subscribed: " + this.getSubscribed());
    }
}

