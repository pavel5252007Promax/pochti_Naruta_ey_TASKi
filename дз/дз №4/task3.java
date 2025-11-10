import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("введи колво строк");
        int n1 = myScanner.nextInt();
        System.out.print("введи колво стролбцов");
        int n2 = myScanner.nextInt();
        int arr[][] = new int[n1][n2];

        for (int j = 0; j < n1; j++) {
            for (int i = 0; i < n2; i++) {
                arr[j][i] = myScanner.nextInt();
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int superk = 0;
        for (int i = 0; i < n1; i++) {
            int k = 0;
            for (int j = 0; j < n2; j++) {
                if (prostoe(arr[i][j])) {
                    int y = arr[i][j];
                    int sum = 0;
                    while (y > 0) {
                        sum += y % 10;
                        y /= 10;
                    }
                    if (prostoe(sum)) {
                        k++;
                    }
                }
            }
            if (k >= 1) {
                superk++;
            }
        }
        if (superk == n1) {
            System.out.println("krasava epta");
        } else {
            System.out.println("VSE HYEVO ");
        }
    }

    public static boolean prostoe(int x) {
        int chislo = x;
        int g = 0;
        for (int i = 1; i <= chislo; i++) {
            if (chislo % i == 0) {
                g++;
            }
        }
        if (g == 2) {
            return true;
        } else {
            return false;
        }
    }
}







