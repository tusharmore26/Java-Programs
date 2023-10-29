class sum{
    int a,b;
    sum(int x, int y){
        a=x;
        b=y;
    }
    sum(int x){
        a=b=x;
    }

    void getdata(int x, int y){
        a=x;
        b=y;
    }

    void getdata(float x){
        a=b=(int)x;
    }

    void add(){
        int addition=a+b;
        System.out.println(addition);

    }
}

public class method_overloading {
    public static void main(String args[]){
        sum s1= new sum(10,10);
        sum s2= new sum(50);
        // sum s3= new sum();
        // sum s4=new sum();ṇ
        
        s1.add();
        s2.add();
        s1.getdata(5,5);
        s2.getdata(10.5f);
        s1.add();
        s2.add();

    }
    
}
