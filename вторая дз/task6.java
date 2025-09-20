import java.util.Scanner;
public class task6{
  public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    int n = myScanner.nextInt();
    float x = myScanner.nextFloat();
    int sumaEpta  = 0;
    int fac = 1;
    float stepen = 1;
    for (int k = 1; k <= n; k++){
      fac *= k;
      sumaEpta += (stepen * x) * fac;
      stepen *= x;
      
      
    }
    System.out.println("Сумма нафик равна: " + sumaEpta);

  }
}
