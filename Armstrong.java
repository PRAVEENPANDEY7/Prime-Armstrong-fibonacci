
import java.util.Scanner;


public class Armstrong {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Armstrong Operations Menu ===");
            System.out.println("1. Check if a number is Armstrong");
            System.out.println("2. Count Armstrong up to a number");
            System.out.println("3. Print all Armstrong in a range");
            System.out.println("4. Find the Nth Armstrong number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to check Armstrong: ");
                    int num = scanner.nextInt();
                    if (isArmstrong(num)) {
                        System.out.println(num + " is a Armstrong number.");
                    } else {
                        System.out.println(num + " is not a Armstrong number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter number to count Armstrong up to: ");
                    int n = scanner.nextInt();
                    int count = countArmstrong(n);
                    System.out.println("Number of Armstrong up to " + n + " is: " + count);
                    break;

                case 3:
                    System.out.print("Enter start of range: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter end of range: ");
                    int end = scanner.nextInt();
                    System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
                    printArmstrongInRange(start, end);
                    break;

                case 4:
                    System.out.print("Enter N to find the Nth Armstrong: ");
                    int nth = scanner.nextInt();
                    int nthArmstrong = findNthArmstrong(nth);
                    System.out.println("The " + nth + "th Armstrong number is: " + nthArmstrong);
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    public static int findNthArmstrong(int n) {
        int count = 0;
        int num = 1;

        while (true) {
            if (isArmstrong(num)) {
                count++;
                if (count == n)
                    return num;
            }
            num++;
        }
    }

    public static void printArmstrongInRange(int start, int end) {
        for (int i=start;i<=end;i++){
            if (isArmstrong(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int countArmstrong(int n) {
        int count=0;
        for (int i=1;i<=n;i++) {
            if (isArmstrong(i)) count++;
        }
        return count;
    }

    public static boolean isArmstrong(int n) {
        int temp=n,digit=0,sum=0;
        //counter for digit count.
        while(temp>0){
            digit++;
            temp/=10;
        }
        temp=n;

        //sum for Armstrong number.
        while (temp>0){
            int d=temp%10;
            int pow=1;
        //d^digit without math.pow...
            for (int i=1;i<=digit;i++){
                pow*=d;
            }
            sum+=pow;
            temp/=10;
        }
        return sum==n;
    }
}
