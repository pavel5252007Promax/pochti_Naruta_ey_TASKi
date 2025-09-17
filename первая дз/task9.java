import java.util.Scanner;
public class task9{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int rr = myScanner.nextInt();
		String ww = String.valueOf(rr);
		int sum = 0;
		int len = ww.length();
		int i = len - 1;
		while (i >= 0){
			char cha = ww.charAt(i);
			int chaInt = Character.getNumericValue(cha);
			sum = sum + chaInt;
			i = i - 1;
		}
		System.out.println(sum);
	}
}