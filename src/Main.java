import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Entre com um número não inteiro");
		double x;
		x = sc.nextDouble();
		System.out.println("O numero informado foi: " + x);
		
		sc.close();

	}

}
