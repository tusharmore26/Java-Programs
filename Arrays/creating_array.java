// there are three steps in array creation
// declaring an array
// creation of an array
// initialization of an array

package Arrays;

public class creating_array {
    public static void main(String args[]){
        int arr[];                   //declaration of array

        arr=new int[5];              //array creation;

        arr[0]=1;                    //array initialization
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        // we can combine above three steps int one
        int arr2[]={1,2,3,4,5};

        // printing an array
        
        for(int i=0;i<=arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
    
}
