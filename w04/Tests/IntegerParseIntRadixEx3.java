package Tests;

public class IntegerParseIntRadixEx3 {
        public static void main(String[] args) {          
          int a = Integer.parseInt("150", 8);  
                 int b = Integer.parseInt("+200", 16);  
                 int c = Integer.parseInt("-344", 12);        
                 System.out.println("Value = "+a);  
                 System.out.println("Value = "+b);  
                 System.out.println("Value = "+c);  
        }  
    }  
    
//Java Integer parseInt (String s, int radix) Method
//This method parses the String argument as a signed decimal integer object in the specified radix by the second argument.
// The characters in the string must be decimal digits of the specified argument except that the first character may be an ASCII minus sign '-' 
//to indicate a negative value or an ASCII plus sign '+' to indicate a positive value. The resulting integer value is to be returned.
