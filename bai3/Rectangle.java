package baitap.bai3;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height)*2;
    }
    public void displayData() {
        System.out.println("Chiều rộng: " + width);
        System.out.println("Chiều dài: " + height);
        System.out.printf("Diện tích: %f \n", getArea());
        System.out.printf("Chu vi: %f \n", getPerimeter());
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10,20);
        rectangle1.getArea();
        rectangle1.getPerimeter();
        rectangle2.getArea();
        rectangle2.getPerimeter();
        System.out.println("Thông tin hình chữ nhật 1:");
        rectangle1.displayData();
        System.out.println("Thông tin hình chữ nhật 2:");
        rectangle2.displayData();
    }
}
