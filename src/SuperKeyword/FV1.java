package SuperKeyword;

public class FV1 extends ForVariable {
    //int x=10;
    int x=5;
    void display(){
        //System.out.println("The value is: "+x);//here the value is 5,because local variable is powerful.
        System.out.println("The value is: "+super.x);//now this is print 10 because i use super keyword
    }
}
