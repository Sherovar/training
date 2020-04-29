import java.math.BigInteger;

import static java.lang.Math.pow;

public class App {
    public static void main(String[] args) {
               BigInteger res = new BigInteger("1");
              for (int i = 1; i<=200 ; i++) {
            res = res.multiply(BigInteger.valueOf((long)pow(i,2)));
        }
        System.out.println(res);
    }
}
