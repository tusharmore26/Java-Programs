// we can pass array of strings to the variable length argument

class demo{
    
    demo(String varargs[]){
        for(int i=0;i<varargs.length;i++){
            String name=varargs[i];
            System.out.println("Hello\t"+name);
        }
    }
    demo(int...num){
       for(int n:num){
        System.out.println("Given number is:\t"+n);
       }

    }
}

public class varargs2 {
    public static void main(String args[]){
        demo d1=new demo(args);
        demo d2=new demo(1,2,3,4,5,6);

    }
    
}
