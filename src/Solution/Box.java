package Solution;

public class Box {

    double height;
    double width;
    double depth;
    Box(double height,double width,double depth){

        this.height=height;
        this.width=width;
        this.depth=depth;

    }
    void displayVol(){
        double vol=height*width*depth;

        System.out.println("Volume of 1st Box: "+vol);
    }

}
