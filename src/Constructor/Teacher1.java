package Constructor;

public class Teacher1 {
    String name;
    int id;
    String dept;
    String sub;
    void Display(){

        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Dept: "+dept);
        System.out.println("Sub: "+sub);
        System.out.println("--------------");
    }
    Teacher1(){                                    // Default constructor
        System.out.println("I am a teacher.");
        System.out.println("--------------");
    }
    Teacher1(String n,int i,String d,String s){                // // parameterised constructor
//        this.name=name;
//        this.id=id;
//        this.dept=dept;
//        this.sub=sub;
        name=n;
        id=i;
        dept=d;
        sub=s;
        Display();

    }
    Teacher1(String name,int id) {                                          // Constructor Overloading
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("--------------");

    }

    public static void main(String[] args) {

    Teacher1 ob1=new Teacher1();
    Teacher1 ob2=new Teacher1("Mahamud",101,"CSE","Algorith");
    Teacher1 ob3=new Teacher1("Najib",102);

    }
}
