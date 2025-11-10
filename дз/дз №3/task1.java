import java.util.Scanner;
public class task1{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введи кол-во столбов паже");
        int n1 = myScanner.nextInt();
        System.out.println("Введи кол-во строк паже");
        int n2 = myScanner.nextInt();
        int arr[][] = new int[n1][n2];
        int k = 0;
        System.out.println("Вводи числа идиот");
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                arr[i][j] = myScanner.nextInt();
            }
        }
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < n2; j++){
                while (k < n1){
                    if (arr[i][j] % 3 == 0){
                        k += 1;
                    }
                    else{
                        break;
                    }
                }
                }
            }
        if (k == n1){
            System.out.println("все четка епта такой уродец на месте");
        }else{
            System.out.println("не хуйня переделывай");
        }

    }
}