class rectangle{
    int length,width;
    void getdata(int a, int b){
        length=a;
        width=b;
    }
    int area(){
        int area=length*width;
        return area;
    }
}


public class classes_and_objects {
    public static void main(String args[]){
        rectangle rect=new rectangle();
        rect.getdata(10,20);
        int area1=rect.area();
        System.out.println(area1);

        // accessing class variable using objects
        rect.length=50;
        rect.width=25;
        int area2=rect.length*rect.width;
        System.out.println(area2);

    }
    
}
