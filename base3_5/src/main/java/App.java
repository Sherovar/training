import static java.lang.Math.*;

public class App {
    public static void main(String[] args) {
      double n = 0;
      double res = 0;
      double e = 4.0/6.0;
      double row = 1/pow(2,n) + 1/pow(3,n);
      while (e <= abs(row)) {
          n++;
          res += row;
          row = 1/pow(2,n) + 1/pow(3,n);
      }
        System.out.println("result " + res);
    }
}
