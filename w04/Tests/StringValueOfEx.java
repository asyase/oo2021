package Tests;

public class StringValueOfEx {
    public static void main(String[] args) {  
        boolean b1=true;  
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'j','a','v','a'};  
        StringValueOfEx obj=new StringValueOfEx();  
        String s1 = String.valueOf(b1);    
        String s2 = String.valueOf(b2);    
        String s3 = String.valueOf(sh);    
        String s4 = String.valueOf(i);    
        String s5 = String.valueOf(l);    
        String s6 = String.valueOf(f);    
        String s7 = String.valueOf(d);    
        String s8 = String.valueOf(chr);    
        String s9 = String.valueOf(obj);    
        System.out.println(s1);  
        System.out.println(s2);  
        System.out.println(s3);  
        System.out.println(s4);  
        System.out.println(s5);  
        System.out.println(s6);  
        System.out.println(s7);  
        System.out.println(s8);  
        System.out.println(s9);  
    }  
}  






        /*public static void main(String args[]){  
        int value=30;  
        String s1=String.valueOf(value);  
        System.out.println(s1+10);//concatenating string with 10  
        }
    }  

Output:
    3010

//The java string valueOf() method converts different types of values into string.
// By the help of string valueOf() method, you can convert int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string.

/*public class StringValueOfExample2 {  
    public static void main(String[] args) { 

        BOOLEAN TO STRING

        boolean bol = true;    
        boolean bol2 = false;    
        String s1 = String.valueOf(bol);    
        String s2 = String.valueOf(bol2);  
        System.out.println(s1);  
        System.out.println(s2);
    }  
}  

Output:
true
false*/

/*public class StringValueOfExample3 {  
    public static void main(String[] args) {  

        // CHAR TO STRING        

        char ch1 = 'A';    
        char ch2 = 'B';  
        String s1 = String.valueOf(ch1);    
        String s2 = String.valueOf(ch2);  
        System.out.println(s1);  
        System.out.println(s2);  
    }  
}  

Output:
A
B*/

/*public class StringValueOfExample4 {  
    public static void main(String[] args) { 

        // FLOAT AND DOUBLE TO STRING  

        float f  = 10.05f;    
        double d = 10.02;  
        String s1 = String.valueOf(f);    
        String s2 = String.valueOf(d);  
        System.out.println(s1);  
        System.out.println(s2);  
    }  
}  

Output:

10.05
10.02 */

