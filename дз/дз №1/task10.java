import java.util.Scanner;
public class task10{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int chisloNafik = myScanner.nextInt();
		String stroka = String.valueOf(chisloNafik);
		String perevertash = "";
		int lenStroki = stroka.length();
		int i = lenStroki - 1;
		while (i >= 0){
			char simvol = stroka.charAt(i);
			perevertash = perevertash + simvol;
			i = i - 1;
		}
	System.out.println(perevertash);

	}
}