import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean res;
        if (x>=-2 && x<=2 && y>=-3 && y<=4) {
            res = true;
        }
        else if (x>=-4 && x<=4 && y>=-3 && y<=0 ){
            res = true;
        }
        else {
            res = false;
        }
        System.out.println(res);

    }
}
