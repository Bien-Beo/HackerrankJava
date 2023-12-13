package BasicExercises;
import java.util.Scanner;

public class Calculator {
	
	public static int Sum(int num1, int num2){
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x; x = in.nextInt();
		int y; y = in.nextInt();
		int total = Sum(x,y);
		System.out.println(total);
	}
}
