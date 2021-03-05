package Tests;

public class IntegerParseIntEx4 {
    public static void main(String[] args) {  
        String s="200";    
        int i=Integer.parseInt(s);    
        System.out.println(s+100);//200100 because + is string concatenation operator    
        System.out.println(i+100);//300 because + is binary plus operator    
    }  
}  
    
//Java Integer parseInt (CharSequence s, int beginText, int endText, int radix)
//This method parses the CharSequence argument as a signed integer in the specified radix argument, beginning at the specified beginIndex and extending to endIndex - 1. This method does not take steps to guard against the CharSequence being mutated while parsing.
