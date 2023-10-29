// nesting of methods means making the call to the method by another methods using the name of that method .
// note here that . operator is not used  only name of the method is mentioned.

class demo{
    int a,b;
    demo(int x,int y){
        a=x;
        b=y;
    }
    int compare(){
        if(a>=b){
            return a;
        }
        else{
            return b;
        }
    }
    void show(){
        int greater=compare();                              //calling compare() method under the method show(). //this is nesting of the methods.
        System.out.println("greater value of :\t"+greater);
    }
}

public class nesting_of_methods {
    public static void main(String args[]){
        demo d1=new demo(10, 90);
        d1.show();

    }
    
}
