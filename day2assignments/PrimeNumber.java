package week1.day2assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a = 11;
		
		boolean f = false;
		
		for (int i = 2; i <= a / 2; i++) {
			
			if (a % i == 0) {
				f = true;
				break;
			}
		}

		if (!f)
			System.out.println(a + " is a prime number.");
		else
			System.out.println(a + " is not a prime number.");

	}

	}


