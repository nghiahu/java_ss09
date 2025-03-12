package baitap.bai9;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if(denominator == 0 ){
            System.out.println("Phân số không hợp lệ");
            System.exit(0);
        }
    }
    public Fraction add(Fraction other){
        int numerator = this.numerator * other.denominator + other.numerator*denominator;
        int denominator =  this.denominator*other.denominator;
        return new Fraction(numerator,denominator);
    }
    public Fraction subtract(Fraction other){
        int numerator = this.numerator * other.denominator - other.numerator*denominator;
        int denominator =  this.denominator*other.denominator;
        return new Fraction(numerator,denominator);
    }
    public Fraction multiply(Fraction other){
        return new Fraction(numerator*other.numerator, denominator*other.denominator);
    }
    public Fraction divide(Fraction other){
        return new Fraction(numerator*other.denominator, denominator*other.numerator);
    }

    public Fraction simplify(){
        if (numerator % denominator == 0 || denominator % numerator == 0){
            this.numerator /= denominator;
            this.denominator /= denominator;
        }else {
            int maxUc = 1;
            int n = 0;
            if (numerator > denominator){
                n =numerator;
            }else {
                n = denominator;
            }
            for (int i=1; i<=n; i++){
                if(numerator % i == 0 && denominator % i == 0){
                    maxUc = i;
                }
            }
            this.numerator /= maxUc;
            this.denominator /= maxUc;
        }
        return new Fraction(numerator,denominator);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(2, 3);

        Fraction sum = fraction1.add(fraction2);
        System.out.println("Tổng hai phân số: " + sum.simplify().toString());
        Fraction sub = fraction1.subtract(fraction2);
        System.out.println("Hiệu hai phân số: " + sub.simplify().toString());
        Fraction mul = fraction1.multiply(fraction2);
        System.out.println("Tích hai phân số: " + mul.simplify().toString());
        Fraction div = fraction1.divide(fraction2);
        System.out.println("Thương hai phân số: " + div.simplify().toString());
    }
}
