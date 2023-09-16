import java.util.Scanner;

public class Main {

    // Method for calculating exponentiation using recursion
    static int exp(int base, int power) {
        // Base case 1: If power is 0, return 1
        if (power == 0) {
            return 1;
        }
        // Base case 2: If power is 1, return the base
        else if (power == 1) {
            return base;
        }
        // Recursive step
        else {
            // Recursive call with power decremented by 1
            int recursiveResult = exp(base, power - 1);
            // Multiply the result of the recursive call with the base
            return recursiveResult * base;
        }
    }

    public static void main(String[] args) {
        int base, power;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a base number : ");
        base = sc.nextInt();

        System.out.print("Enter a power number : ");
        power = sc.nextInt();

        System.out.print("Result = " + exp(base, power));

    }
}
