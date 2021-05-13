# ArrayQueue-PrimeCalculator
A program that computes all the prime numbers up to some number n. For this
purpose, you will use an algorithm developed by Eratosthenes (276 BC), a Greek
mathematician, poet and astronomer. This algorithm is known as the Sieve of
Eratosthenes.

The following pseudocode describes the algorithm:

1. Instantiate a queue, call this "numbers" and fill it with all integers from 2 to n
2. Instantiate a second queue, call this "primes"
3. Let p = First value of queue of numbers
4. While (p <= sqrt(n))
1. Push p into "primes"
2. Go through "numbers" and eliminate numbers divisible by p (you might
want to use an additional queue for this)
5. Add all the elements of "number" to "primes". These should all be prime
numbers.

● A class called Sieve that is able to construct a Sieve object by calling: Sieve newSieve = new Sieve();

● The sieve class have a "void primesTo(int n)" method. It prints all
the primes from 2 to n to System.out. The primes are separated by a space or a comma.

● Read in the input from the user via stdin (scanner)

● Check if the user tries to call primesTo(int n) with n < 2, a proper
Exception/Error message is thrown.

Example​​output
Please enter upper bound
20
Primes up to 20 are: 2, 3, 5, 7, 11, 13, 17, 19Please enter upper bound
2
Primes up to 2 are: 2
Please enter upper bound
0
Error: Input must be a number greater than 2.
