package Tests;
public class IntegerParseIntEx2 {
	public static void main(String[] args) {
		int decimalExample = Integer.parseInt("20");
                      int signedPositiveExample = Integer.parseInt("+20");
                      int signedNegativeExample = Integer.parseInt("-20");
        
                  System.out.println("Value = "+decimalExample);
                  System.out.println("Value = "+signedPositiveExample);
                  System.out.println("Value = "+signedNegativeExample);
	      }
   }


   //This method parses the String argument as a signed decimal integer object. The characters in the string must be decimal digits, except that the first character of the string may be an ASCII minus sign '-' to indicate a negative value or an ASCII plus '+' sign to indicate a positive value. It returns the integer value which is represented by the argument in a decimal integer.
//Java Integer parseInt (String s) Method


