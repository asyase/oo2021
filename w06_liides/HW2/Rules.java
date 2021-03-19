package HW2;

    public class Rules implements Main{
        public double celsius(double fahrenheit){
            double celsius_temp = (fahrenheit-32)*5/9;
            return celsius_temp;
        }
        public double fahrenheit(double celsius){
            double fahrenheit_temp = ((9*celsius)/5)+32;
            return fahrenheit_temp;
        }
        public double celsius_to_kelvin(double celsius){
            double kelvin_temp1= celsius + 273.15;
            return kelvin_temp1;
        }
        public double fahrenheit_to_kelvin(double fahrenheit){
            double kelvin_temp2 = ((fahrenheit-32)*5/9) + 273.15;
            return kelvin_temp2;
        }

    }
    
    
    

