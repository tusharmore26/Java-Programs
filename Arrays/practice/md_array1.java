package Arrays.practice;

public class md_array1 {
    public static void main(String args[]){

        int[][] arr=new int[5][5];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                 arr[i][j]=1;

                }
                else{
                    arr[i][j]=0;
                }
                System.out.println();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }

    }
    
}
