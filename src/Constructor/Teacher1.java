package Constructor;

public class Teacher1 {
    String Name;
    int id;
    String dept;
    String sub;

    Teacher1(){
        System.out.println("I am a teacher.");
        System.out.println("--------------");
    }
    Teacher1(String name,int id,String dept,String sub){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Dept: "+dept);
        System.out.println("Sub: "+sub);
        System.out.println("--------------");
    }
    Teacher1(String name,int id) {
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
