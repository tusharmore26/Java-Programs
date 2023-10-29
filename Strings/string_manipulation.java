package Strings;

public class string_manipulation {
    public static void main(String args[])
    {
       StringBuffer s1= new StringBuffer("Tushar");
       StringBuffer s2= new StringBuffer("More");

    //    adding character at the nth position
       s1.setCharAt(5, 'u');
       System.out.println(s1);

    //    appending string
    s1.append(s2);
    System.out.println(s1);

    // insertion of the string
    s1.insert(2,s2);
    System.out.println(s1);

    // set length of the string
    s2.setLength(8);
    System.out.println(s2);
    int x=s1.length();
    System.out.println(x);
    }
    
}
