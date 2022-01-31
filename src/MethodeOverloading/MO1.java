package MethodeOverloading;

public class MO1 {
    public static void main(String[] args) {
        M_overload ob1= new M_overload();
        ob1.add();
        double sum=ob1.add(15,15);
        System.out.println("Addition is: "+sum);
        ob1.add(15.6,16.4);
        ob1.add(18.8,10);
    }

}
