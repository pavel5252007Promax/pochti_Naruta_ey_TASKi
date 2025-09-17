import java.util.Scanner;
public class task8{
	public static void main(String[] args){
	Scanner myScanner = new Scanner(System.in);
	int k = myScanner.nextInt();
	int i = 2;
	while(i <= 10){
		System.out.println("При умножение на "+ i + " : " + i * k);
		i = i + 1;
	}
	}
}