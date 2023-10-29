package Vectors;

import java.util.Vector;

public class vector_demo2 {
    public static void main(String args[]){
        Vector<String> v1= new Vector<>();
        int length= args.length;

        for(int i=0;i<length;i++){
            v1.addElement(args[i]);
        }
        
        System.out.println("Values of the vectors are:\t"+v1);

        //copying vectors into arrya of strings
        int size=v1.size();
        String s1[]=new String[size];
        v1.copyInto(s1);

        System.out.println("");
        System.out.println("Array of strings after copying from vector is:\t");
        for(int i=0;i<size;i++){
            System.out.println("Index "+(i+1)+" :\t"+s1[i]);
        }
        


    }
    
}
