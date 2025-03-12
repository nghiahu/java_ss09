package baitap.bai7;

import baitap.bai5.Vector2D;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return this.b*this.b - 4*this.a*this.c;
    }
    public boolean hasRealRoots(){
        double delta = getDiscriminant();
        if(delta >= 0){
            return true;
        }else{
            return false;
        }
    }
    public double getRoot1(){
        double delta = getDiscriminant();
        if(delta == 0){
             return this.b*-1 / 2*this.a;
        }
        return this.b*-1 + Math.sqrt(delta) / 2*this.a;
    }
    public double getRoot2(){
        double delta = getDiscriminant();
        return this.b*-1 - Math.sqrt(delta) / 2*this.a;
    }
    public void display(){
        if(this.hasRealRoots()){
            if(this.getDiscriminant() == 0){
                System.out.println("Phương trình có nghiệm kép: " + this.getRoot1());
            }
            if(this.getDiscriminant() > 0){
                System.out.println("Phương trình có hai nghiệm phân biệt: ");
                System.out.println("X1 = "+this.getRoot1());
                System.out.println("X2 = "+this.getRoot2());
            }
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(2, 7, 3);
        quadraticEquation.display();
    }
}
