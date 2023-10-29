//vector are used to store any number of objects.
//size of the vector is not fixed it varies with the objects that are being stored.

package Vectors;

import java.util.Vector;

public class vector_demo {
    public static void main(String args[]){
        Vector<String> v1= new Vector<>();
        int length=args.length;

        for(int i=0;i<length;i++){
            v1.addElement(args[i]);
        }

        System.out.println("Values of the vectors are:\t"+v1);
    }
    
}
