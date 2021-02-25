package HW2;

public class CatMainHW {

        public static void main(String args[]){
           /* Konstruktori abil kahe objekti loomine  */
           Cat catOne = new Cat("Kittik");
           Cat catTwo = new Cat("Assol");
     
           // Meetodi kutse iga loodud objekti jaoks.
           catOne.catAge(15);
           catOne.catBreed("Tõutu");
           catOne.catWeight(2.500);
           catOne.printcat();
     
           catTwo.catAge(4);
           catTwo.catBreed("Meini kass");
           catTwo.catWeight(3.200);
           catTwo.printcat();
        }
     }
    
   