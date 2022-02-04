package ClassObject;

public class CallTest {
    public static void main(String[] args) {
        int x=10;
        CallByValue ob1= new CallByValue();
        System.out.println("The value of x: "+x);

        ob1.check(x);
        System.out.println("x after call: "+x);


    }


}
