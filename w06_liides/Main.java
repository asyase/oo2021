
public class Main {
    public static void main(String[] args) {
        EstonianID estonian = new EstonianID("60107107029");
        FinnishID finnish = new FinnishID("241299-003K");
        
        Lion lion = new Lion();
        Fox fox = new Fox();

        System.out.println("ESTONIAN ID:");
        System.out.println(estonian.getGender());
        System.out.println(estonian.getFullYear());
        System.out.println(estonian.getDOB());
        System.out.println(estonian.getMonth());
        System.out.println(estonian.getDay());

        System.out.println("FINNISH ID:");
        System.out.println(finnish.getGender());
        System.out.println(finnish.getFullYear());
        System.out.println(finnish.getDOB());
        System.out.println(finnish.getMonth());
        System.out.println(finnish.getDay());
        
        
        System.out.println("Lõvi liides");
        System.out.println(lion.speak());
        System.out.println(lion.eat());
        System.out.println(lion.sleep());
        System.out.println(lion.beSneaky());
        System.out.println(lion.lookAround());
        System.out.println(lion.attack());
        System.out.println(lion.defend());

        System.out.println("Rebase liides");
        System.out.println(fox.speak());
        System.out.println(fox.eat());
        System.out.println(fox.sleep());
        System.out.println(fox.beSneaky());
        System.out.println(fox.lookAround());
        System.out.println(fox.attack());
        System.out.println(fox.defend());
    }
        }
