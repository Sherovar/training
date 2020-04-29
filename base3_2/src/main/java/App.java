import java.util.Scanner;
    public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("the coordinates of the cut ");
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y;
            System.out.println("Input step ");
            int h = scanner.nextInt();
            while (x1<x2) {
                if (x1>2) {
                    y = x1;
                }
                else {
                    y = -x1;
                }
                System.out.println("x = " + x1 + "  y = " + y);
                x1 += h;
            }

        }
}
