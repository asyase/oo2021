//static int parseInt(String s)
//static int parseInt(String s, int radix)

//s — строковое представление десятичного значения.
//radix — будет использоваться для преобразования строки в целое число.

//parseInt(String s): возвращает целое (только в десятичной системе).

//parseInt(int i): возвращает целое число, учитывая строковое представление десятичных, двоичных, восьмеричных и шестнадцатеричных (radix равно 10, 2, 8 или 16 соответственно) чисел в качестве входных данных.
//parseInt essentially converts a String to a Integer.

//In your example, calling Integer.parseInt on a string is parsing this string to find an integer.
//String someString = "123";
//int i = Integer.parseInt( someString );

//Parsing is to read the value of one object to convert it to another type. 
//For example you may have a string with a value of "10". 
//Internally that string contains the Unicode characters '1' and '0' not the actual number 10. The method Integer.parseInt takes that string value and returns a real number.


//String tenString = "10"

//This won't work since you can't add an integer and a string
//Integer result = 20 + tenString;

//This will set result to 30
//Integer result = 20 + Integer.parseInt(tenString);


package Tests;

public class TestParseint {
    public static void main(String args[]){
        int x = Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444",16);
  
        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
    }

}



      


    




















//Метод parseInt() — в Java используется для получения примитивного типа данных определенной строки, другими словами — преобразует строку в число. Метод parseXxx() — это статический метод и может иметь один аргумент или два.
