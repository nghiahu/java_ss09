package baitap.bai5;

public class Vector2D {
    double x;
    double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double calculateMagnitude(){
        return Math.sqrt(x*x + y*y);
    }
    public Vector2D add(Vector2D v) {
        double x = this.x + v.x;
        double y = this.y + v.y;
        Vector2D resultAdd = new Vector2D(x, y);
        return resultAdd;
    }
    public Vector2D subtract(Vector2D v) {
        double x = this.x - v.x;
        double y = this.y - v.y;
        Vector2D resultSbb = new Vector2D(x, y);
        return resultSbb;
    }
    public double dotProduct(Vector2D v) {
        return this.x*v.x + this.y*v.y;
    }
    public void displayVector(){
        System.out.println("("+x+","+y+")");

    }
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(4,3);
        Vector2D v2 = new Vector2D(5,2);
        System.out.println("Vector1: ");
        v1.displayVector();
        System.out.println("Vector2: ");
        v2.displayVector();

        System.out.println("Độ dài vector1: " + v1.calculateMagnitude());
        System.out.println("Độ dài vector2: " + v2.calculateMagnitude());
        Vector2D add = v1.add(v2);
        System.out.println("Tổng hai vector: ");
        add.displayVector();
        Vector2D subtract = v1.subtract(v2);
        System.out.println("Hiệu hai vector: " );
        subtract.displayVector();
        System.out.println("Tích vô hướng giữa hai vector: " + v1.dotProduct(v2));
    }
}
