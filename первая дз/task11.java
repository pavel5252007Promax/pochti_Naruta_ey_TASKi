import java.util.Scanner;
public class task11{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int chisloNafikBlin = myScanner.nextInt();
		int sum = 0;
		int stepen = 1;
		while (chisloNafikBlin > 0){
			int z = ((chisloNafikBlin % 10) * stepen);
			sum += z;
			stepen *= 2;
			chisloNafikBlin /= 10;
		}
		System.out.println(sum);


	}
}