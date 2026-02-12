import java.util.Scanner;

public class Prime {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Prime Operations Menu ===");
            System.out.println("1. Check if a number is prime");
            System.out.println("2. Count primes up to a number");
            System.out.println("3. Print all primes in a range");
            System.out.println("4. Find the Nth prime number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to check: ");
                    int num = scanner.nextInt();
                    if (isPrime(num)) {
                        System.out.println(num + " is a prime number.");
                    } else {
                        System.out.println(num + " is not a prime number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter number to count primes up to: ");
                    int n = scanner.nextInt();
                    int count = countPrimes(n);
                    System.out.println("Number of primes up to " + n + " is: " + count);
                    break;

                case 3:
                    System.out.print("Enter start of range: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter end of range: ");
                    int end = scanner.nextInt();
                    System.out.println("Prime numbers between " + start + " and " + end + " are:");
                    printPrimesInRange(start, end);
                    break;

                case 4:
                    System.out.print("Enter N to find the Nth prime: ");
                    int nth = scanner.nextInt();
                    int nthPrime = findNthPrime(nth);
                    System.out.println("The " + nth + "th prime number is: " + nthPrime);
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }


    public static int findNthPrime(int n) {
        int count = 0;
        int num = 2; // start from first prime
        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) return num;
            }
            num++;
        }
    }

    public static void printPrimesInRange(int start, int end) {
        for(int i=start;i<=end;i++){
            if(isPrime(i)) System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int countPrimes(int n) {
        int count=0;
        for (int i=2;i <= n;i++){
            if(isPrime(i)) count++;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if(n<=1) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0) return false;
        }
        return true;
    }
}

