import java.util.Scanner;
public class task5{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int sumaNafik = 0;
		int k = 1;
		int fac2 = 1;
		int fac1 = 1;
		while (n > 0){
			fac1 = 1 * k * fac2;
			sumaNafik += fac1;
			fac2 = fac1;
			k += 1;
			n -= 1;
		}
		System.out.println(sumaNafik);
	}
}