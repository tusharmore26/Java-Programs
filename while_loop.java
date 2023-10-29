import java.util.Scanner;
public class while_loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string :\t");
        String str=sc.nextLine();
        int n=str.length();
        int i=0;
        while(i<n){
            System.out.println(str);
            i++;

        }


    }
    
}
