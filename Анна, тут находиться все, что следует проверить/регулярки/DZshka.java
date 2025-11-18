import java.util.Scanner;

public class DZshka {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();
        if (name.matches("[A-Z][a-z]{1,14}")) {
            System.out.println("norm");
        } else {
            System.out.println("pizdec");
        }
    }
}