import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EratosthenesPrimeSieve eratosthenesPrimeSieve = new EratosthenesPrimeSieve();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein?");
        String line = scanner.nextLine();
        eratosthenesPrimeSieve.isPrime()
    }
}