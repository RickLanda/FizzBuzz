import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor max: ");
        int max = sc.nextInt();
        sc.close();

        FizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(1, max);
    }
}
