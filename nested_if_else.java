public class nested_if_else {
    public static void main(String args[]){
        int a=10;
        int b=20;
        int c=3;
        if(a>b){
            if(a>c){
                System.out.println("A is greater!!");
            }
            else{
                System.out.println("C is greater");
            }
        }
        else{
            if(c>b){
                System.out.println("C is greater!!");
            }
            else{
                System.out.println("B is greater!!");
            }
        }
    }
    
}
