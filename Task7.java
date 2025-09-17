import java.util.Scanner;

public class Task7 {
	public static void main(String[] args){
	Scanner myScanner = new Scanner(System.in);
	System.out.println("52нах");
	float x = myScanner.nextFloat();
	float y = myScanner.nextFloat();
	int pen = 0;
	boolean tORf = false;
	for (int i = 1; i <= 10; i++){
		if (i * i >= x * x + y * y){
			tORf = true;
			pen = i;
			break;
		}
	}
	if (tORf){
		System.out.println(pen + " ваще свег еу");
	}else{
		System.out.println("kiss or MISSSED RR");
	}
	}

}

