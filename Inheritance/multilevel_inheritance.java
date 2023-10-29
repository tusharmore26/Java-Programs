package Inheritance;

class first{
    int x,y;
    first(int a, int b){
        x=a;
        y=b;
    }
    void show(){
        int add=x+y;
        System.out.println("Addition :\t"+add);

    }
}
class second extends first{
    int x,y;
    second(int a, int b){
        super(a,b);
        x=a;
        y=b;
    }
    void show2(){
        int sub=x-y;
        System.out.println("Subtraction:\t"+sub);
    }
}
class third extends second{
    int x,y;
    third(int a, int b){
        super(a, b);
        x=a;
        y=b;
    }
    void show3(){
        int mul=x*y;
        System.out.println("Multiplication:\t"+mul);
    }
}

public class multilevel_inheritance {
    public static void main(String args[]){
        third t1=new third(10, 5);
        t1.show();
        t1.show2();
        t1.show3();

    }
}
