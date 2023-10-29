package Strings;

public class array_string {
    public static void main(String args[])
    {
        String str[]= new String[3];
        str[0]="Tushar";
        str[1]="Ajay";
        str[2]="Ashlesh";

        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

        // we can also pass an array of the string to the empty string array
        System.out.println();
        System.out.println("Array of string:");
        System.out.println();
        
        String str2[]=new String[3];
        String str3[]={"Pune ","Mumbai","Bengalore"};

        for(int i=0;i<str2.length;i++){
            str2[i]=str3[i];
        }

         for(int i=0;i<str2.length;i++){
            System.out.println(str2[i]);
        }

    }
    
}
