package Strings;

public class alphabetical_ordering {
    public static void main(String args[]){
        String str[]={"Pune","Mumbai","Bengalore","Delhi","Chennai","Solapur","Kolkatta"};

        System.out.println("Before sorting:\t");
        for(int i=0;i<str.length;i++){
            System.out.print("\t"+str[i]);
        }
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
               if(str[j].compareTo(str[i])<0){
                String temp=str[i];
                str[i]=str[j];
                str[j]=temp;
               }
                
            }
        }
        System.out.println();
        System.out.println("After Sorting:\t");
         for(int i=0;i<str.length;i++){
            System.out.print("\t"+str[i]);
        }
            
      
    }
    
}
