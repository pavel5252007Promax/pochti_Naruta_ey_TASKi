import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        float x = myScanner.nextFloat();
        float y = myScanner.nextFloat();
        int n = myScanner.nextInt();
        float r = x * x + y * y;
        if (r <=(n * n)) {
            System.out.println("лежит");
        } else {
            System.out.println("не хочет лежать");
        }
    }
}
