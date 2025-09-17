import java.util.Scanner;
public class task13{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int min = -1000000;
		int kamaz = myScanner.nextInt();
		while (kamaz > min){
			min = kamaz;
			kamaz = myScanner.nextInt();
		}
		
	}
}