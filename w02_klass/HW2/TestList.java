package HW2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class TestList {
  public static void main(String[] args) {
    ArrayList<String> candies = new ArrayList<String>();
    candies.add("Skittles");
    candies.add("Snickers");
    candies.add("Hubba Bubba");
    candies.add("Choco Pie");
    candies.set(0, "Choco Pie");
    //candies.remove(2);
    //candies.clear();
    
    candies.size();
    System.out.println(candies.size());
    System.out.println(candies);
    System.out.println(candies.get(0));
  
  }
  
  public static void linkedlist(String[] args) {
        LinkedList<String> dances = new LinkedList<String>();
 
        dances.add("hip hop");
        dances.add("contemporary");
        dances.add("ballet");
        System.out.println("dancehall");
 
        dances.addFirst("jazz");
        dances.addLast("cheerleading");
        System.out.println(dances);
        System.out.println(dances.peekFirst());
        System.out.println(dances.peekLast());

        //  to display the first item in the list
   //System.out.println(dances.getFirst());
//tagastab loendi esimese / viimase elemendi ja eemaldab selle loendist. Tagastab nulli, kui loend on tühi
       // System.out.println(dances.pollFirst());
       //  System.out.println(dances.pollLast());

  // System.out.println("Mis on jäänud listis?");
  // System.out.println(dances);

    }

    public static void hashset(String[]args){

        HashSet<String> countries  = new HashSet<String>();

        
        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");
        countries.add("India");

        
        System.out.println(countries);
        System.out.println("List contains India or not:" +
                           countries.contains("India"));

        
    // countries.remove("Australia");
    // System.out.println("List after removing Australia:"+countries);

    //System.out.println("The size of the set is: " + countries.size()); 
        
    }

  public static void hashmap(String[]args){

  HashMap <String, String> planets = new HashMap <String, String>();

planets.put("Mercury", "the first");
planets.put("Earth", "the third");
planets.put("Saturn", "the sixth");
planets.put("Neptune", "the eighth");
planets.put("Venus", "the second");

System.out.println(planets);
System.out.println(planets.size());

planets.get("Venus");

planets.remove("Saturn");

// Print keys
for (String i : planets.keySet()) {
  System.out.println(i);
}

  // Print values
for (String i : planets.values()) {
  System.out.println(i);

}

  // Print keys and values
for (String i : planets.keySet()) {
  System.out.println("key: " + i + " value: " + planets.get(i));
}

}

}

//Hashmap - salvestab value and key,ei ole duplikaadivõtme väärtusi,ta on sorteerimata. Kõiki klassi, mis rakendavad liidest Set, toetavad Mapi rakendused sisemiselt. HashSet salvestab üksusi HashMapi abil. Ehkki üksuse HashMap-i lisamiseks peab see olema esindatud võtme-väärtuste paarina, lisatakse HashSeti ainult väärtus.

//Lists salvestab indeksitega, jarjekorras, muudetavad, saab dubleerida, 

//Hashset unikaalsed objektid(ei kordu)
//- ei hoia oma elementide järjekorda, mis tähendab, et elemendid tagastatakse mis tahes järjekorras.
//-ei võimalda duplikaadimälu. Kui lisate olemasoleva üksuse, kirjutatakse vana väärtus üle.
//- lubab kogule lisada nullväärtuse, kuid ainult ühe väärtuse.
//- on sünkroonimata


//LinkedList- andmed hoitakse nö containerites. Järjestikuseks juurdepääsuks optimeeritud. See rakendab kõiki loenditoiminguid ja võimaldab sisestada kõiki objekte, sealhulgas null.
//LinkedListi konteiner, mille loendi keskel on kiire sisestamise / kustutamise toimingud. Loendis on link esimesele konteinerile ja igal konteineril on link loendis järgmise konteineriga.




  
 
    