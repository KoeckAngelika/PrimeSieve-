import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve();
        eratosthenesPrimeSieve.printPrimes();
        while (true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n Geben sie eine Zahl ein zwischen 1 und 500. Die wird geprüft ob sie eine Primzahl ist.");
            int userNumber = Integer.parseInt(scanner.nextLine());
            boolean isPrimeNumber = eratosthenesPrimeSieve.isPrime(userNumber);
            if (isPrimeNumber == true)
            {
                System.out.println(userNumber + " ist eine Primzahl");
                break;
            }
            System.out.println(userNumber + " ist keine Primzahl");
        }
    }
}