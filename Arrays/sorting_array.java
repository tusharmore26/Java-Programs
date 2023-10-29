package Arrays;

public class sorting_array {
    public static void main(String args[]){
        int arr[]={55,44,22,1,11,100};
        System.out.println("Given array elements are:\t");
        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
        System.out.println("");
        System.out.println("Sorted Array Elements are:\t");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
               
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
    }
    
}
