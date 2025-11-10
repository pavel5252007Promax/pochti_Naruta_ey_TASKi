import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("введи колво строк");
        int n1 = myScanner.nextInt();
        System.out.print("введи колво стролбцов");
        int n2 = myScanner.nextInt();
        int arr[][] = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = myScanner.nextInt();
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
            int z = 0;
            for (int j = 0; j < n2; j++) {
                int k = 0;
                int chislo = arr[i][j];
                int counts = 0;
                while (chislo > 0) {
                    counts++;
                    int m = chislo % 10;
                    chislo /= 10;
                    if (m > chislo % 10) {
                        k++;
                    } else {
                        break;
                    }
                }
                if (counts == k && (counts + k) >= 4) {
                    z++;
                }
            }
            if (z == 2) {
                superk++;
            }
        }
        if (superk == n1) {
            System.out.println("krasava epta");
        } else {
            System.out.println("VSE HYEVO ");
        }
    }
}







