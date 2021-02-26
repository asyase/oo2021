package HW1;

public class YearOperations {
    
        public static boolean Calculations(int year) {
        boolean leapYear = false;
    
        // Kui aastaarv on jagatav 4ga, on liigaasta
        if (year % 4 == 0) {
    
          // kui aasta on jagatav 100ga,..
          if (year% 100 == 0) {
    
            // kui aasta on jagatav 400ga,..
            if (year % 400 == 0)
              leapYear= true;
              // kui aasta ei ole jagatav 400ga, on ta tavaline aasta 
              else
                leapYear = false;
        }
    
          // kui aasta ei ole jagatav sajaga, siis on liigaasta
          else
            leapYear = true;
        }
        //kõigil muudel juhtudel on tegu tavalise aastaga
        else
          leapYear = false;
    
        if (leapYear){
            return true;
        }
        return false;
       
       }   
    
    }
    

