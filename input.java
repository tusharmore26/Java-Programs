// reading input from keyboard
// using scanner class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your name:\t");
        String name=sc.nextLine();
        System.out.println("Name of the Student is:\t"+name);
        System.out.println("Enter your age:\t");
        int age=sc.nextInt();
        System.out.println("Age of the student is:\t"+age);
        
        // reading input using system.console class
        System.out.println("Enter the city name:\t");
        String city=System.console().readLine();
        System.out.println("Name of the city is:\t"+city);

        // reading input using bufferreader class 
        // for this we have imported bufferreader class and inputstreamclass
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        
try{


        System.out.println("Enter the marks:\t");
        String s= br.readLine();
        int marks=Integer.parseInt(s);
        System.out.println("Marks of the student are:\t"+marks);
}
catch(IOException ioe){
    System.out.println("Error Ocurred!!");
}


       }
    
}
