package week1.day2assignments;

import java.util.Arrays;

public class FindingSecondSmallestNumber {
	
	public static void main(String[] args) {

		int[] a = {23,45,67,32,89,22};

		Arrays.sort(a);

		System.out.println("Second smallest number is : "+a[1]);

}
}
