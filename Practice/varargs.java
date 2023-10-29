package Practice;


class demo{
    demo(String...args){
        for(String name:args){
            System.out.println("Java is "+name+" language.");
        }
    }
}
public class varargs {
    public static void main(String args[]){
        demo d1=new demo("Object-Oriented","Generic","Useful ","Interesting","Complecated");
    }

    
}
