import java.util.Scanner;
public class task4{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int sum = 0;
		int k = 1;
		for (int i = 0; i < n; i++){
			sum += 2 * k;
			k *= 2;
		}
		System.out.print(sum);
	
	}
}