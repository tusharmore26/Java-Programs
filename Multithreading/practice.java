package Multithreading;
import java.lang.Thread;

class A {
    int a, b;
    void get(int x, int y){
        a=x;
        b=y;
    }
    void sum(){
        int sum=a+b;
        System.out.println("Sum="+sum);
    }

}
    
public class practice {
    public static void main(String args[]){
        A a1 = new A();
        new Thread(){
            public void run(){
                a1.get(50, 50);
            }
        }.start();

        new Thread(){
            public void run(){
                a1.sum();
            }
        }.start();
   
    }
    
}
