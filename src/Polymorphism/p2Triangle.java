package Polymorphism;

public class p2Triangle extends p2Shape {
    double g;
    double b;

    p2Triangle(double g, double b) {
        this.g = g;
        this.b = b;
    }

    @Override
    double area() {
        System.out.print("Area of Triangle: ");
        return .5* b * g;
    }
}
