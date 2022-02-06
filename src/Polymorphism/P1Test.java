package Polymorphism;

public class P1Test {
    public static void main(String[] args) {
        P1Person p=new P1Person();
        p.display();
        P1Teacher t=new P1Teacher();
        t.display();
        P1Student s=new P1Student();
        s.display();
    }
}
