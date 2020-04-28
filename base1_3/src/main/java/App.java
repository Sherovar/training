public class App {
    public static void main(String[] args) {
        double x=Math.PI/2;
        double y=Math.PI/2;
        double res;
        res = ((Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println(res);
    }
}
