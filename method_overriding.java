class superclass{
    int x;
    superclass(int a){
        x=a;
    }
    void show(){
        System.out.println("Super X:\t"+x);
    }
}

class subclass extends superclass{
    int y;
    subclass(int a,int b){
        super(a);
        y=b;
    }
    void show(){
        System.out.println("Super X:\t"+x);
        System.out.println("Sub Y:\t"+y);
    }
}

public class method_overriding {
    public static void main(String args[]){
        subclass sub= new subclass(10, 20);
        sub.show();

    }
    
}
