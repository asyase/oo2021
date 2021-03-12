import java.util.*;
public class PrimeNumbersKT {

//-----------------------------Koosta massiiv esimese tuhande algarvuga. Leia selle sõela abil, millised on kümme suurimat algarvu, mis on väiksemad, kui tuhandenda algarvu ruut.----------------------------------- 
	public static void printPrimeNumbers() {
		int length = 1000;
		int[] primeN = new int[length];
		int n = 0;
		for (int i = 2;n < length;i ++){

			if(primeNumber(i)){
				primeN[n] = i ;
				n ++;
			}
		}
		
		int thousandSquare = primeN[999]*primeN[999];
	
		System.out.println("Tuhat esimest algarvu: "+ Arrays.toString(primeN));
		System.out.println("See on tuhandene algarv: " + primeN[999]);
		System.out.println("Saadud tuhandeda algarvu ruut: " +thousandSquare);

		int[] tenNumbers = new int[10];
		int m = 0;
		for (int i = thousandSquare;m < 10;i--){
			if(primeNumber(i)){
				tenNumbers[m]=i;
				m ++;
			}
		}
		System.out.println("  Ja 10 suurimat algarvu ja mis on väiksemad kui tuhandeda algarvu ruut: "+ Arrays.toString(tenNumbers));
	
	}

	public static boolean primeNumber(int n){
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i ++)
			if (n % i == 0)
				return false;

		return true;

	}
	
	//-----------------------------------------------Teata, kas kasutaja sisestatud arv jagub kahe, kolme viie või seitsmega.--------------------------------------------

	public static void isDivided (int input){
		int primeN = input;
		if (primeN % 2 == 0){
			System.out.println("Sisestatud arv "+primeN+" jagub kahega");
		}	
		if (primeN% 3 == 0){
			System.out.println("Sisestatud arv "+primeN+" jagub kolmega");
		}	
		if (primeN % 5 == 0){
			System.out.println("Sisestatud arv "+primeN+" jagub viiega");
		}
		if (primeN % 7 == 0){
			System.out.println("Sisestatud arv "+primeN+" jagub seitsmega");
		}	
		
		
	}	
	
	
	
	//----------------------------------------Teata, kas kasutaja sisestatud arv on algarv. ----------------------------------------------------

	public static void isItPrimeNumber (int input){
		int primeN = input;
		boolean test = false;
		for (int i = 2; i <= primeN / 2; ++i) {
			if (primeN % i == 0) {
				test = true;
				break;
			}
		}
		if(test == false){
			System.out.println("Number "+primeN+" ON algarv!");
		}	
		if(test == true){
			System.out.println("Number "+primeN+" EI OLE algarv!");
		}
	}
	
	
	public static void main(String[] args){	
	
		Scanner input = new Scanner(System.in);
        System.out.println("    Programmiga leiate: \n-Kas antud arv on algarv või mitte, \n-Kas arv jagub kahe, kolme või viiega \n-Näitab 1000 esimest algarvu \n-Väljastab kümme suurimat algarvu, mis on väiksemad, kui tuhandenda algarvu ruut ");
			System.out.print("    Sisesta number: ");

			Integer nr = input.nextInt();
			isDivided(nr);
			isItPrimeNumber(nr);

			
			System.out.println();
			printPrimeNumbers();
			System.out.println();
		
		
	}
}	