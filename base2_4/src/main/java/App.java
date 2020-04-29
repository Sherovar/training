import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hole size");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Input brick size");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int holeS = a*b;
        if (x*y <= holeS || x*z <= holeS || y*z <= holeS) {
            System.out.println("The brick will fit into the hole");
        }
        else {
            System.out.println("The brick will not fit into the hole");
        }
    }
}