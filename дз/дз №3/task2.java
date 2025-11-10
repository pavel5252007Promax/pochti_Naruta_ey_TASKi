import java.util.Scanner;
public class task2{
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
            for (int j = 0; j < n2; j++){
                String stroka = String.valueOf(arr[i][j]);
                int k = 0;
                while (k < stroka.length()){
                    if ((arr[i][j] % 10) % 2 == 0){
                        k+=1;
                        }
                    else{
                        break;
                        }
                    }
                if (k == stroka.length()){
                    counts += 1;
                    }
                }
            }
        if (counts == n1
        ){
            System.out.println("ВСЕ ЧОТКА БРАТКА, ТЕЛЕПУЗ ВСЕГО 1 в каждой строчке");
        }
        else{
            System.out.println("БОЖЕ ЧЕ ЗА ЛЕЙМ НАХ ПШЛ");
        }
    }
}