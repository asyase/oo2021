package GeneerikaHW;
public class JalaNumber<J, N> {
    private J jalg;
    private N nimi;
  
  
     public JalaNumber(J jalg, N nimi) {
         this.nimi = nimi;
         this.jalg = jalg;
     }
  
     public N getNimi() {
         return nimi;
     }
  
     public void setNimi(N nimi) {
         this.nimi = nimi;
     }
  
     public J getJalg() {
         return jalg;
     }
  
     public void setJalg(J jalg) {
         this.jalg = jalg;
     }
  
  }
