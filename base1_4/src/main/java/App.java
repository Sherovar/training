public class App {
    public static void main(String[] args) {
    float x = 123.456f;
    float y = (int) (x);
    float z =(int) ((x-y)*1000);
    float temp = z + y/1000;
        System.out.println(temp);
    }
}
