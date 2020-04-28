import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angleA = scanner.nextInt();
        int angleB = scanner.nextInt();
        int sum = angleA+angleB;
        if (sum < 180) {
            System.out.println("This triangle can exist.");
            if (sum == 90 || angleA == 90 || angleB == 90) {
                System.out.println("This is even rectangular");
            }
            else {
                System.out.println("This is can not be");
            }
        }
    }
}
