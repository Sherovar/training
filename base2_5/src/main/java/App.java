import java.util.Scanner;

import static java.lang.Math.pow;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x " );
        double x = scanner.nextDouble();
        double y ;
        if (x<=3){
            y = pow(x,2) - (3*x) + 9;
        }
        else {
            y = 1/(pow(x,3) - 6);
        }
        System.out.println("Function result is " + y);
    }
}
