package week1.day2assignments;

public class PalindromeOrNot {

	public static void main(String[] args) {

		int number = 34342, reverseNum = 0, remainder;

		int originalNumber = number;

		while (number != 0) {
			remainder = number % 10;
			reverseNum = reverseNum * 10 + remainder;
			number /= 10;
		}

		if (originalNumber == reverseNum) {
			System.out.println(originalNumber + " is Palindrome.");
		}
		else {
			System.out.println(originalNumber + " is not Palindrome.");
		}

	}
	
	}


