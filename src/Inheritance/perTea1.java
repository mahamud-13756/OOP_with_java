package Inheritance;

import java.util.Scanner;

public class perTea1 {
    //public static void main(String[] args) {

        void display3(int a,int p,String ad){
            Scanner s=new Scanner(System.in);
            Teacher ob1=new Teacher();
            ob1.name=s.nextLine();
            ob1.age=a;
            ob1.phn=p;
            ob1.add=ad;
            ob1.display1();
            ob1.display2();
        }

//        Teacher ob2=new Teacher();
//        ob2.name="Aminul";
//        ob2.age=24;
//        ob2.phn=16273;
//        ob2.add="Dhaka";
//        ob2.display1();
//        ob2.display2();

}
