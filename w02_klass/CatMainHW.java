public class CatMainHW {

        public static void main(String args[]){
           /* Konstruktori abil kahe objekti loomine  */
           Cat catOne = new Cat("Kittik");
           Cat catTwo = new Cat("Assol");
     
           // Meetodi kutse iga loodud objekti jaoks.
           catOne.CatAge(15);
           catOne.CatBreed("Tõutu");
           catOne.CatWeight(2.500);
           catOne.printCat();
     
           catTwo.CatAge(4);
           catTwo.CatBreed("Meini kass");
           catTwo.CatWeight(3.200);
           catTwo.printCat();
        }
     }
    
   