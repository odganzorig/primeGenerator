package literateProgramming;


public class PrimePrinter {
    public static void main(String[] args) {
        final int numPrimes = 1000;
        PrimeGenerator primeGenerator = new PrimeGenerator(numPrimes);
        int[] primes = primeGenerator.generatePrimes();
        NumberPrinter numberPrinter = new NumberPrinter(4, 50);
        numberPrinter.printNumber(numPrimes, primes);
    }

}
