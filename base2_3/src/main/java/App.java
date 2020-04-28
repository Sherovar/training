import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class App {
    public static void main(String[] args) {
        double x1 = 1;
        double x2 = 2;
        double x3 = 4;
        double y1 = 1;
        double y2 = 2;
        double y3 = 4;
        double p;
        double s;
        double lengthAB = sqrt(pow((x1-x2),2)+pow((y1-y2),2));
        double lengthAC = sqrt(pow((x1-x3),2)+pow((y1-y3),2));
        double lengthBC = sqrt(pow((x2-x3),2)+pow((y2-y3),2));
        p = (lengthAB+lengthAC+lengthBC) / 2;
        s = sqrt(p * (p-lengthAB) * (p-lengthAC) * (p-lengthBC));
        if (s > 0) {
            System.out.println("This triangle does exist.");
        }
        else {
            System.out.println("This triangle doesn't exist.");
        }

    }
}
