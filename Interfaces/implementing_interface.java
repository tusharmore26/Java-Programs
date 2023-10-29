package Interfaces;

interface Area{
    static final float pi=3.14f;
    float compute(float x, float y);

}


//implementing interface 
class rectangle implements Area{
    public float compute(float x, float y){
        return x*y;
    }
}


//implementing interface into another class
class circle implements Area{
    public float compute(float x, float y){
        return pi*x*y;
    }
}


public class implementing_interface {
    public static void main(String args[]){
        rectangle rect= new rectangle();
        circle cr= new circle();
        Area ar;
        ar=rect;        
        System.out.println("Area of rectangle is:\t"+ar.compute(5.5f, 10.5f));
        ar=cr;
        System.out.println("Area of circle is:\t"+ar.compute(5.5f, 2.5f));

    }
    
}
