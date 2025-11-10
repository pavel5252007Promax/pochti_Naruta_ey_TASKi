import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("введи колво строк");
        int n = myScanner.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[(n / 2)][j] = 1;
                arr[i][(n / 2)] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}







