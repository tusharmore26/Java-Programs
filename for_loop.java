import java.util.Scanner;
public class for_loop {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number:\t");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        // int j=1;
        for(int j=1;j<=n;j++){
            System.out.print("*");
            j++;
        }
        System.out.println("");
        i++;
    }
    }
}
