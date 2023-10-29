//multiple interface can possible in java using interfaces
package Interfaces;

class student{
    int roll_no;

    void get(int a){
        roll_no=a;
    }

    void show1(){
        System.out.println("ROll No of the Student:\t"+roll_no);
    }
}

class marks extends student{
    int m1,m2;

    void get2(int a, int b){
        m1=a;
        m2=b;
    }

    void show2(){
        System.out.println("Marks of the students:\n M1:\t"+m1+"\nM2:\t"+m2);
    }
}

interface sport{
    static final int m3=29;
    void show3();
}

class result extends marks implements sport{
    int total;
    public void show3(){
        System.out.println("Sport Marks of the student:\t"+m3);
    }

    void display(){
        total=m1+m2+m3;
        show1();
        show2();
        show3();
        System.out.println("Total Marks of the student are:\t"+total);
    }


}


public class multiple_inheritance {
    public static void main(String args[]){
    result rs= new result();
    rs.get(49);
    rs.get2(28,30);
    rs.display();
    }
    
}
