import java.util.Scanner;
    public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your number ");
            int num = scanner.nextInt();
            int res = 0;
            for (int i = 0 ; i <= num ; i++){
                res += i;
            }
            System.out.println("Result is " + res);
        }
}
