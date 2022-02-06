package Polymorphism;

public class p2Shape {
    double a;
    double b;
    p2Shape(double a,double b){
        this.a=a;
        this.b=b;
    }
    void area(double a,double b){
        double c=a*b;
        System.out.println("The area is: "+c);
    }
}
