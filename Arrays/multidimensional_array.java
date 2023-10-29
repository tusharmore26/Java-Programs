// in multidimensional array first index refers to the row and second index refers to the column


package Arrays;

public class multidimensional_array {
    public static void main(String args[]){
        int arr[][]={
            {0,0,0},
            {1,1,1},
            {2,2,2}
        };
        // int len=arr.length;
        // System.out.println(len);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println("");
        }
    }
    
}
