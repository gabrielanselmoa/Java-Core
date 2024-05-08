package course.general.model.entities;

public class Rectangle {

    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return (width + height) * 2;
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
