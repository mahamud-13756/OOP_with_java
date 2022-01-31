package MethodeOverloading;

public class M_overload {

    int add(int a, int b){
        return a+b;
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(double a, int b){
        System.out.println(a+b);
    }
    void add(){
        System.out.println("Nothing to add");
    }



}
