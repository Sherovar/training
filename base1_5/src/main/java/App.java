public class App {
    public static void main(String[] args) {
        int time = 3661 ;
        int hh = time/3600;
        int mm = (time - (hh*3600)) / 60 ;
        int ss = (time - (hh*3600) - (mm*60));
        System.out.println(hh + "h " + mm + "m " + ss + "s");
    }
}
