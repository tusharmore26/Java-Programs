class demo{
     static int a;
    static float mul(float x,float y){
        return x*y;
    }
    static int sum(int x, int y){
        return x+y;
    }
}

public class static_members {
    public static void main(String args[]){
        demo d1=new demo();
        demo d2=new demo();
        demo d3=new demo();
        d2.a=10;                        //value remains same for all objects untill other object modifies it
        System.out.println(d1.a);   
        System.out.println(d2.a);
        System.out.println(d3.a);

        float a=d1.mul(10.5f, 5.5f);
        int b=d1.sum(10,10);
        System.out.println("A:\t"+a+"B:\t"+b);

    }
    
}
