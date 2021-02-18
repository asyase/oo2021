
public class Cat {
    
   public String name;
   public int age;
   public  String breed;
   public  double weight;
     
    // See on klassi konstruktor Cat. 
    public Cat (String name){
       this.name = name;
    }
    // Kassi vanuse määramine muutujale age.
    public void CatAge(int catAge){
       age =  catAge;
    }
    /* Tõuke muutuja määramine . */
    public void CatBreed(String catBreed){
       breed = catBreed;
    }
    /* Kaalu muutuja määramine . */
    public void CatWeight(double catWeight){
       weight = catWeight;
       
    }
    /* Üksikasjaliku teabe kuvamine */
    public void printCat(){
       System.out.println("Nimi: "+ name );
       System.out.println("Vanus: " + age + " aastat vana" );
       System.out.println("Tõuge: " + breed);
       System.out.println("Tema kaal: " + weight + " kg");
    }
 }

