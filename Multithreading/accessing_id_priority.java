package Multithreading;
import java.lang.Thread;

import Arrays.creating_array;

class A extends Thread{
    public void run(){
        System.out.println("This is Thread A:\nId is:\t"+Thread.currentThread().getId()+"\nPriority is:\t"+Thread.currentThread().getPriority());
       
}
}

class B extends Thread{
    public void run(){
        System.out.println("This is Thread B:\nId is:\t"+Thread.currentThread().getId()+"\nPriority is:\t"+Thread.currentThread().getPriority());
    }

}

class C extends Thread{
    public void run(){
        System.out.println("This is Thread C:\nId is:\t"+Thread.currentThread().getId()+"\nPriority is:\t"+Thread.currentThread().getPriority());
   }

}

public class accessing_id_priority {
    public static void main(String args[]){
        System.out.println("This is main Thread");
        System.out.println("Id is:\t"+Thread.currentThread().getId());
        System.out.println("Priority is:\t"+Thread.currentThread().getPriority());

        A a1 = new A();
        B b1 = new B();
        C c1 = new C();

        a1.setPriority(Thread.MAX_PRIORITY);
        b1.setPriority(Thread.NORM_PRIORITY);
        c1.setPriority(Thread.MIN_PRIORITY);

        a1.start();
        b1.start();
        c1.start();
    
    }
    
}
