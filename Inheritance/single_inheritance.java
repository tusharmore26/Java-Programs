package Inheritance;

class first{
    int length,width;
    first(int a, int b){
        length=a;
        width=b;
    }
    int area(){
        return length*width;
    }
}
class second extends first{
    int height;
    second(int a, int b, int c){
        super(a, b);
        height=c;
    }
    int volume(){
        return length*width*height;
    }
}

public class single_inheritance {
    public static void main(String args[]){
        second s1=new second(10, 010, 10);
        int area1=s1.area();
        int volume1=s1.volume();
        System.out.println("Area:\t"+area1+"\tVolume:\t"+volume1);

    }
    
}
