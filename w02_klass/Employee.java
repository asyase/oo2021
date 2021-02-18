public class Employee {
        String name;
        int age;
        String designation;
        double salary;
         
        // See on klassi konstruktor Employee. 
        public Employee(String name){
           this.name = name;
        }
        // Töötaja vanuse määramine muutujale age.
        public void empAge(int empAge){
           age =  empAge;
        }
        /* Muutuja määramine designation. */
        public void empDesignation(String empDesig){
           designation = empDesig;
        }
        /* Muutuja määramine salary. */
        public void empSalary(double empSalary){
           salary = empSalary;
        }
        /* Üksikasjaliku teabe kuvamine */
        public void printEmployee(){
           System.out.println("Nimi:"+ name );
           System.out.println("Vanus:" + age );
           System.out.println("Ametikoht :" + designation );
           System.out.println("Palk:" + salary);
        }
     }

