import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String spis[][] = {
                {"один", "два", "три"},
                {"четыре", "пять", "шесть"}
        };
        String spis2[][] = new String[3][2];
        int shet = 0;
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 3; i++) {
                spis2[i][j] = spis[j][i];
            }

        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 2; i++) {
                System.out.print(spis[i][j] + " ");
            }
            System.out.println("");
        }
    }

}