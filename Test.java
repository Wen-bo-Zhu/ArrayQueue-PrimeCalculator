package ;
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		System.out.println("Please enter upper bound");
		Scanner input = new Scanner(System.in);
		int res = input.nextInt();
		Sieve newSieve = new Sieve();
		newSieve.primesTo(res);
		input.close();
	}
}
