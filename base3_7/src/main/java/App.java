import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int m = scanner.nextInt();
        System.out.println("Enter second number ");
        int n = scanner.nextInt();
        while (m<=n) {
            System.out.print("Number : " + m + " Dividers :");
            for (int i = 2; i < m; i++) {
                if (m % i == 0) {
                    System.out.print(" " + i);
                }
            }
            m++;
            System.out.println("");
        }
    }
}
