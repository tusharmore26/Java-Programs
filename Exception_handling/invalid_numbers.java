package Exception_handling;

import java.lang.Exception;


public class invalid_numbers {
    public static void main(String args[]){
    int invalid=0;
    int number,count=0;
    for(int i=0;i<args.length;i++){
        try{
        number=Integer.parseInt(args[i]);
        }
        catch(NumberFormatException e){
            invalid+=1;
            System.out.println("Invalid number:\t"+args[i]);
            continue;
        }
        count+=1;
    }

    }

    
}
