

public class Fox implements Animal {

    @Override
        public String speak() {
            return "Frrr!";
        }
    
        @Override
        public String eat() {
            return "Rebane armastab süüa põhiliselt närilisi, eriti uruhiiri";       
        }
    
        @Override
        public String sleep() {
            return "Rebane mõnikord magab maja katusel";       
        }     
        
    
        @Override
        public String beSneaky() {
            return "Rebane üritab olla kõige kavalana";       
        }  
    
        @Override
        public String lookAround() {

            return "Rebane alati vaatab enda ümber";
        }
    
        @Override
        public String attack() {

            return "Rebane kipub väikseid jäneseid";
        }
    
        @Override
        public String defend() {

            return "Rebane kaitseb oma pere";
        }
}

