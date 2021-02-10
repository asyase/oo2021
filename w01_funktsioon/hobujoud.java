public class hobujoud{
	
        public static int leiahobujoud(int rpm, int ft, int rdps){
            return (rpm * ft) / rdps ;
        }
        public static void main(String[] args){
            System.out.println(leiahobujoud(3000,440,5252));
        }
    }

