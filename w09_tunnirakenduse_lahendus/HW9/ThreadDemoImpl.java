package HW9;



    public class Thh {

        public static void main(String args[]) {
            Thread th2 = new Thread(new ToTen());
            Thread th3 = new Thread(new FromTen());
    
            th2.start();
    
            try {
                th2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            th3.start();
        }
    
    }
    
    class ToTen implements Runnable {
        
        @Override
        public void run() {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        }
    
    }
    
    class FromTen implements Runnable {
    
        @Override
        public void run() {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
            }
        }
    
    }
