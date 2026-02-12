import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("\n=== Fibonacci Operations Menu ===");
        System.out.println("1. Fibonacci upto a number.");
        System.out.println("2. Count Fibonacci  up to a number");
        System.out.println("3. Print all Fibonacci in a range");
        System.out.println("4. Find the Nth Fibonacci number");
        System.out.println("5. =====Exit=====");

        System.out.println("Which opration you wanna perform :");
         choice = scanner.nextInt();

         switch (choice){
             case 1:
                 System.out.println("Enter the term you wanna print fibonacci series: ");
                 int n=scanner.nextInt();
                 fibUpto(n);
                 break;
             case 2:
                 System.out.println("Count the fibonacci up to an number, Enter the number :");
                 int p=scanner.nextInt();
                 System.out.println("Totle number of fibonacci up to "+p+" is the :"+fibUptoCount(p));
                 break;
             case 3:
                 System.out.println("Enter the start:");
                 int start=scanner.nextInt();
                 System.out.println("Enter the End: ");
                 int end=scanner.nextInt();
                 fibonacciInRange(start,end);
                 break;
             case 4:
                 System.out.println("Enter the nth term you wanna know:");
                 int k=scanner.nextInt();
                 System.out.println(k+"th turm of fibonacci series is:"+nThFibonacci(k));
                 break;
             case 5:
                 System.out.println("Exit.");
             default:
                 System.out.println("Invalid choice entred.");
         }
    scanner.close();
    }
    public static int fibUptoCount(int p){
        int a=0,b=1,count=0;
        for (int i=1;i<=p;i++){
            count++;
            a=a+b;
            b=a-b;
        }
        return count;
    }
    public static void fibUpto(int n){
        int a=0,b=1;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a+b;
            b=a-b;
        }
    }
    public static int nThFibonacci(int n){
        int a=0,b=1;
        for (int i=1;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void fibonacciInRange(int start,int end){
            int a=0,b=1;
            if (a >= start && a <= end)
                System.out.print(a + " ");

            while(b<=end){
                if (b>=start)
                    System.out.print(b+" ");
                a=a+b;
                b=a-b;
            }
        System.out.println();
        }
}
