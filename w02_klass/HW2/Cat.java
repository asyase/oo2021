package HW2;

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
    public void catAge(int catAge){
       age =  catAge;
    }
    /* Tõuke muutuja määramine . */
    public void catBreed(String catBreed){
       breed = catBreed;
    }
    /* Kaalu muutuja määramine . */
    public void catWeight(double catWeight){
       weight = catWeight;
       
    }
    /* Üksikasjaliku teabe kuvamine */
    public void printcat(){
       System.out.println("Nimi: "+ name );
       System.out.println("Vanus: " + age + " aastat vana" );
       System.out.println("Tõuge: " + breed);
       System.out.println("Tema kaal: " + weight + " kg");
    }
 }

