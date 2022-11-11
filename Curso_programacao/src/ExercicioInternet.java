import java.util.Scanner;

public class ExercicioInternet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double C, F, Re, Ra;

		C = 2.42;
		F = C * 1.8 + 32;
		Re = C * 0.8;
		Ra = C * 1.8 + 32 + 459.67;

		System.out.println("valor para a Temperatura em graus: C = " + C);
		System.out.println("valor para a Temperatura em graus: F = " + F);
		System.out.println("valor para a Temperatura em graus: Re = " + Re);
		System.out.println("valor para a Temperatura em graus: Ra = " + Ra);

		sc.close();
	}

}
