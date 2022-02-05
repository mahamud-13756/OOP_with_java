package SuperKeyword;

public class FM1 extends ForMethod {
    // display method

    @Override
    int display() {
      //  System.out.println("This is B class");
        int c=super.display();
        System.out.println(c);
        int c1 = c;
        return c1;
    }
}
