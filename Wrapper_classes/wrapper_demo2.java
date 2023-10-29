package Wrapper_classes;
import java.util.Scanner;;
public class wrapper_demo2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float f1;
        float f2;
        float sum;

        System.out.println("Enter any value in float:\t");
        String str=sc.nextLine();
        // f1=sc.nextFloat();

        f1=Float.valueOf(str);

        System.out.println("Enter another value in float:\t");
        String str2=sc.nextLine();
        // f2=sc.nextFloat();

        f2=Float.valueOf(str2);

        sum=f1+f2;
        System.out.println("Sum of the numbers is:\t"+sum);



    }
    
}
