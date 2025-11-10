import java.util.Scanner;

public class task2 {
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
        int k = 0;
        for (int j = 0; j < n1; j++) {
            int pervaiSumma = 0;
            int arr1 = arr[0][j];
            while (arr1 > 0) {
                pervaiSumma += arr1 % 10;
                arr1 /= 10;
            }
            int c = 0;
            for (int i = 0; i < n2; i++) {
                int sum = 0;
                int mas = arr[i][j];
                while (mas > 0) {
                    sum += mas % 10;
                    mas /= 10;
                }
                if (sum == pervaiSumma) {
                    c++;
                } else {
                    break;
                }
            }
            if (c == n2) {
                k++;
            }
        }

        if (k > 0) {
            System.out.println("Zaebok");
        } else {
            System.out.println("xyeva");
        }
    }
}







