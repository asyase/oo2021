package HW8;

public class Person {
        private int allCalories;
    
        public void howManyCalories() {
            System.out.println("Täna kaloreid saadud: " + allCalories);
        }
    
        public void eaten(int calories) {
            allCalories += calories;
        }
    
        public void isTheCalorieIntakeDone(int norm) {
            if(allCalories < norm) {
                System.out.println("Kalorite tarbimine päevas EI OLE täidetud");
            } else {
                System.out.println("Kalorite tarbimine päevas ON täidetud");
            }
        }

        
    }

