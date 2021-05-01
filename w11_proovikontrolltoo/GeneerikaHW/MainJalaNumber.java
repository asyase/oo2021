package GeneerikaHW;
public class MainJalaNumber {
   

        public static void main(String[] args) {
    
            JalaNumber<Double, String> list = new JalaNumber<>(38.0, "Anna");
            JalaNumber<Double, String> list2 = new JalaNumber<>(46.5, "Alex");
            JalaNumber<Double, String> list3 = new JalaNumber<>(36.5, "Karoliina");
            JalaNumber<Double, String> list4 = new JalaNumber<>(44.0, "Daniel");
    
            System.out.println(list.getNimi() + ", sinu jalanumbriks on " + list.getJalg());
            System.out.println(list2.getNimi() + ", sinu jalanumbriks on " + list2.getJalg());
            System.out.println(list3.getNimi() + ", sinu jalanumbriks on " + list3.getJalg());
            System.out.println(list4.getNimi() + ", sinu jalanumbriks on " + list4.getJalg());
 
    
        }
    
    }

