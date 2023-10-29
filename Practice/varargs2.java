package Practice;

class demo{
    int sum=0;
    void get(int...args){
        for(int num:args){
            sum+=num;
    }
      System.out.println("Sum of the numbers:\t"+sum);
}
}
public class varargs2 {
    public static void main(String args[]){
        demo d1=new demo();
        d1.get(1,2,3,4,5);

    }
    
}
