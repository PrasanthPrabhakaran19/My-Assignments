package week1.day2assignments;

public class FibonacciSeries {
	
	public static void main(String[] args) {

		int a = 7, sum, first = 0, second = 1;

		for	(int i=1; i<a; i++)	{

			sum = first + second;

			first = second;

			second = sum;

			System.out.println(sum);

		}
	}
}
