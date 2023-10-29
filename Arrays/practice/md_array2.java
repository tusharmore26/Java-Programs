package Arrays.practice;

public class md_array2 {
    public static void main(String args[]){
        int[][] arr=new int[5][5];
        
        final int cl=arr[0].length;       //no of colums
        int count=cl;
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                if((j+1)==count){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=0;
                }

            }
            count--;
            System.out.println();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
