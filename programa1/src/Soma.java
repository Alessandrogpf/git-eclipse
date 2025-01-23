import java.util.Scanner;
public class Soma {
	public static void main(String [] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.printf("A soma é: %d ", num1 + num2);
	}
}
