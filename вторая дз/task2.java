import java.util.Scanner;
public class task2{
	public static void main(String[] args){
		Scanner mSc = new Scanner(System.in);
		int n = mSc.nextInt();
		int rr = 1;
		int summa = 0;
		for (int i = 1; i <= n; i++){
			summa += n * rr;
			rr *= n;

		}
	System.out.println(summa);
	}	
}