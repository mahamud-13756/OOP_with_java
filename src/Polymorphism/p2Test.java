package Polymorphism;

public class p2Test {
    public static void main(String[] args) {
        p2Shape s=new p2Shape();
        p2Rectangle r=new p2Rectangle(10,20);
        p2Triangle t=new p2Triangle(2,4);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());

    }
}