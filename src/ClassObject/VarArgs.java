package ClassObject;

public class VarArgs {
    void add(int ... x){ // variable length arguments
        int sum=0;
        for(int i : x){ // for each loop
            sum=sum+i;

        }
        System.out.println(sum);
    }
}
