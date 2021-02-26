package HW2;

public class Cipher {
        // Krüpteerib teksti nihke abil

        //e = (x + n) mod 26 - selleks, et šifreerida sõnum

        //e = (x - n) mod 26 - selleks, et iga kirja dekrüpteerida
        //loon meetod encrypt ja loon tulemuse salvestamiseks muutujat
        public static StringBuffer encrypt(String text, int shift) {
            StringBuffer result = new StringBuffer();  // Java klasse StringBuffer kasutatakse juhul, kui on vaja teha palju muudatusi tähemärgis.
            //Klass StringBuffer tähistab laiendatavaid ja muudetavaid märgijadasid, võimaldades märkide ja alamstringide sisestamist olemasolevasse stringi kuhu tahes.
     
            for (int i = 0; i < text.length(); i++) {
                if (Character.isUpperCase(text.charAt(i))) {
                    char ch = (char) (((int) text.charAt(i) + //Meetod charAt () tagastab stringi määratud indeksis oleva märgi.
                            shift - 65) % 26 + 65); //tähestikku pikkus 26
                    result.append(ch);
                } else {
                    char ch = (char) (((int) text.charAt(i) +
                            shift - 97) % 26 + 97);
                    result.append(ch);
                }
            }
            return result;
        }
     
        // Krüpteerib šifri, kasutades shift
        public static StringBuffer decrypt(String cipher, int shift) {
            StringBuffer result = new StringBuffer();
     
            for (int i = 0; i < cipher.length(); i++) {
                if (Character.isUpperCase(cipher.charAt(i))) {
                    char ch = (char) (((int) cipher.charAt(i) +
                            shift - 65) % 26 + 65); //65- suured tähed
                    result.append(ch);
                } else {
                    char ch = (char) (((int) cipher.charAt(i) +
                            shift - 97) % 26 + 97); //97-väiksed tähed
                    result.append(ch);
                }
            }
            return result;
        }
     
        public static void main(String[] args) {
            String originalText = "WONDERFUL";
            int shiftCount = 4; //lepitakse kokku samm, mille kauguselt tähestikust võetakse sõnas oleva tähe asemele asendustäht
            System.out.println("See on sõnade šifreerimise näide");
            System.out.println("Krüpteerimine");
            System.out.println("Tekst  : " + originalText);
            System.out.println("Samm : " + shiftCount);
            String cipher = encrypt(originalText, shiftCount).toString();
            System.out.println("Krüpteeritud salakood: " + cipher);
            System.out.println("Dekrüpteerimine");
            System.out.println("Krüpteeritud salakood: " + cipher);
            System.out.println("Samm: " + shiftCount);
            String decryptedPlainText = decrypt(cipher, 26 - shiftCount).toString();
            System.out.println("Dekrüpteeritud tavaline tekst: " + decryptedPlainText);
        }
    }
    
    

