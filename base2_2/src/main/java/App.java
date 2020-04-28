import java.util.Scanner;
public class App {
    static int findMax (int a, int b) {
        int max = a ;
        if (a < b) {
            max = b;
        }
        return max;
    }
    static int findMin (int a, int b) {
        int min = a;
        if (a > b) {
            min = b;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int res = findMax(findMax(a,b), findMin(c,d));

        System.out.println(res);

    }
}
