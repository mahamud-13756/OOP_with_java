package Polymorphism;

public class p2Rectangle extends p2Shape {
    double h;
    double w;

    p2Rectangle(double h, double w){
        this.h=h;
        this.w=w;
    }

    @Override
    double area(){
        System.out.print("Area of Rectangle: ");
        return h*w;

    }


}
