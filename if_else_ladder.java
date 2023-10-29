
public class if_else_ladder {
    public static void main(String args[]){
    int a=30;
    int b=20;
    int c=100;
    if(a>b){
        if(a>c){
            System.out.println("A is greater!!");
        }
        else{
            System.out.println("C is greater!!");
        }
    }
    else if(b>a){
        if(b>c){
            System.out.println("B is greater!!");
        }
        else{
            System.out.println("C is greater!!");
        }
    }
    else{
        System.out.println("C is greater!!");

    }
   

        
    
    }
}
