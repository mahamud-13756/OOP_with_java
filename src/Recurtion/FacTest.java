package Recurtion;

import java.util.Scanner;

public class FacTest {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Please enter a value: ");

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            FactorialDemo ob = new FactorialDemo();
            int f = ob.fact(n);

            System.out.println("The factorial is: "+f);
        }
    }
}
