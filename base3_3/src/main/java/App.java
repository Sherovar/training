import static java.lang.Math.pow;

public class App {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 1 ; i<=100 ; i++){
            res += pow(i,2);
        }
        System.out.println("Result " + res);
    }
}
