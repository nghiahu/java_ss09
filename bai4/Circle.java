package baitap.bai4;

public class Circle {
    double radius;

    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    public void displayData(){
        System.out.println("Bán kính: " + this.radius);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Hình tròn 1:");
        circle.displayData();

        Circle circle2 = new Circle(3);
        circle2.getArea();
        circle2.getPerimeter();
        System.out.println("Hình tròn 2:");
        circle2.displayData();
    }
}
