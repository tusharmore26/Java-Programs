package Vectors;

import java.util.Vector;

public class vector_methods {
    public static void main(String args[]){
        Vector<String> v1= new Vector<>();

        // adding items to the vectors
        v1.addElement("Pune");
        v1.addElement("Mumbai");
        v1.addElement("Delhi");
        
        System.out.println("Vector afte adding items:\t"+v1);

        // displaying the item at the apecific index
        System.out.println();
        System.out.println("Item at the index 1:\t"+v1.elementAt(1));

        // removing element with name
        v1.removeElement("Mumbai");
        System.out.println();
        System.out.println("Vector after removing item:\t"+v1);

        //removing element with the index number
        v1.removeElementAt(0);
        System.out.println();
        System.out.println("Vector after removing another item:\t"+v1);

        //inserting element with index name
        v1.insertElementAt("Solapur", 1);
        System.out.println();
        System.out.println("Vector after inserting new item:\t"+v1);

        //displaying the size of the vector
        int size=v1.size();
        System.out.println();
        System.out.println("Size of the vector is:\t"+size);


        
        
    }
    
}
