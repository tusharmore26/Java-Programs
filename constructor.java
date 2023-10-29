class sum{
    int x,y;
    
    // default constructor
    sum(){
        x=0;
        y=0;
    }
    void put(){
        System.out.println("X:\t"+x+"Y:\t"+y);
    }


// parameterized constructor
    sum(int a, int b){
        x=a;
        y=b;
    }
    void show(){
        int add=x+y;
        System.out.println("Sum of two numbers:\t"+add);
    }
}



public class constructor {
    public static void main(String args[]){

        sum s1= new sum();          //call to default constructor   
        sum s2= new sum(10,10); //call to parameterized constructor
        
        s1.put();
        s2.show();
        
    }
}
