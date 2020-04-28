

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class App {
    public static void main(String[] args) {


        double a = 2;
        double b = 3;
        double c = 4;
        double res;
        res = ((b + sqrt(pow(b,2) + (4 * a * c))) / (2 * a)) - (((pow(a,3)) * c) + pow(b, -2));
        System.out.println(res);
    }
}
