import java.util.Scanner;
public class do_while_loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:\t");
        int n=sc.nextInt();
        int i=1;
        do{
            int j=1;
            do{
                System.out.print("*");
                j++;
            }while(j<=i);
            System.out.println("");
            i++;
        }while(i<=n);
      

    }
    
}
