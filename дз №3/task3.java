import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("кол-во строк будет");
        int n1 = myScanner.nextInt();
        System.out.println("кол-во столбцов будет");
        int n2 = myScanner.nextInt();
        int arr[][] = new int[n1][n2];
        int counts = 0;
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
            int k2 = 0;
            for (int j = 0; j < n2; j++){
                String stroka = String.valueOf(arr[i][j]);
                int k = 0;
                int n = arr[i][j];
                while (n > 0){
                    k += (n % 10);
                    n /= 10;
                }
                if (k % 5 == 0){
                       k2+=1;
                }
            }
            if (k2 >= 2){
                counts += 1;
            }

            }
        if (counts == n1
        ){
            System.out.println("ВСЕ ЧОТКА УЦЫШКА, ХОТЯ БЫ ИКЕЛЕ В ХЭР ЖЭЙ ТОЧНО БАР");
        }
        else{
            System.out.println("БОЖЕ ЧЕ ЗА БРЕТА КУТАГЫМ ОТСДА");
        }
    }
}