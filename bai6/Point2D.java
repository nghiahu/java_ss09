package baitap.bai6;

public class Point2D {
    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double distanceTo(Point2D p){
        return Math.sqrt((p.x-this.x)*(p.x-this.x) + (p.y-this.y)*(p.y-this.y));
    }
    public void displayPoint(){
        System.out.println("(" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        Point2D point1 = new Point2D(1,2);
        Point2D point2 = new Point2D(3,4);

        System.out.println("Khoảng cách giữa hai điểm: " + point1.distanceTo(point2));
        System.out.println("Tạo độ mới: ");
        point1.setX(5);
        point1.setY(6);
        point1.displayPoint();
    }
}
