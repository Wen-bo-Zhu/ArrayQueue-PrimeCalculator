package hw3;


public class Sieve {
	public ArrayQueue<Integer> numbers = new ArrayQueue<>();
	public ArrayQueue<Integer> primes = new ArrayQueue<>();
	public int p;

	public void primesTo (int n) throws IllegalStateException {
		if (n < 2) {
			throw new IllegalStateException("Error: Input must be a number greater than 2.");
		}
		else {
			for(int i=2; i<=n; i++) {
				numbers.enqueue(i);
			}
			
			p = numbers.dequeue();
			while (p<= Math.sqrt(n)) {
				primes.enqueue(p);
				ArrayQueue<Integer> addi = new ArrayQueue<>();
				int orinsize = numbers.size();
				for (int i = 0; i<orinsize;i++) {
					int pointer = numbers.dequeue();
					if (pointer%p != 0) {
						addi.enqueue(pointer);
					}
				}
				int orinasize = addi.size();
				for (int j = 0; j< orinasize;j++) {
					numbers.enqueue(addi.dequeue());
				}
				p = numbers.dequeue();
			}
			primes.enqueue(p);
			while (numbers.isEmpty()== false) {
				primes.enqueue(numbers.dequeue());
			}
			System.out.println("Primes up to "+n+" are:"+ primes.toString());
		}
	}


}
