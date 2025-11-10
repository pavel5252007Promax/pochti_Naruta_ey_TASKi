import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("введи колво строк");
        int n1 = myScanner.nextInt();
        System.out.print("введи колво стролбцов");
        int n2 = myScanner.nextInt();
        int arr[][] = new int[n1][n2];
        int flag = 0;

        for (int i = 0; i < n1; i++) {
            int y = 0;
            for (int j = 0; j < n2; j++) {
                arr[i][j] = myScanner.nextInt();
                if (palin(arr[i][j])) {
                    y += 1;
                }
            }
            if (y == 1) {
                flag += 1;
            }
        }
        if (flag == n1) {
            System.out.println("все четка");
        } else {
            System.out.println("америка сосать ");
        }

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean palin(int x) {
        int orig = x;
        int rewers = 0;
        while (x > 0) {
            int num = x % 10;
            rewers = rewers * 10 + num;
            x /= 10;
        }
        return (orig == rewers);
    }

}







