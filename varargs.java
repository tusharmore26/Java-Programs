// varargs means variable length arguments
// using varargs we can pass any number of parameters to the methods or constructors by declaring only one parameter

class demo{
    demo(String...student){                 //varargs used as student
        for(String name:student){
            System.out.println("Hello\t"+name);
        }
    }
}

public class varargs {
    public static void main(String args[]){
        demo d1=new demo("Tushar","Ajay","Ashlesh");

    }
    
}
