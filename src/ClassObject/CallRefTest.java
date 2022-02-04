package ClassObject;

public class CallRefTest {
    public static void main(String[] args) {
        CallByRef ob1=new CallByRef();
        ob1.name="Mahamud";
        System.out.println("Before calling: "+ob1.name);

        ob1.check(ob1);
        System.out.println("after calling: "+ob1.name);
    }

}
