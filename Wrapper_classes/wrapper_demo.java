//wrapper classes are used to convert primitive data types into objects

package Wrapper_classes;

import java.util.Vector;

public class wrapper_demo {
    public static void main(String args[]){
        int num=20;
        Integer n1=num;
        Vector<Integer> v1= new  Vector<>();
        v1.addElement(num);

        System.out.println(v1);
        

    }

    
}
