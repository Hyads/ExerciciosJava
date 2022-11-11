import java.util.Locale;
import java.util.Scanner;

public class exerciciosInternert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int sexo, qtMulheres = 0, qtHomens = 0;
		float altura, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Escolha o sexo (1 - Mulher e 2 para Homen) ");
			sexo = sc.nextInt();
			System.out.print("Digite um valor para a altura ");
			altura = sc.nextFloat();
			if (sexo == 1) {
				qtMulheres++;
			} else if (sexo == 2) {
				qtHomens++;

				somaH = somaH + altura;
			} else {
				System.out.print("Sexo Invalido ");
			}
			if (altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}
		}
		mediaHomens = somaH / qtHomens;

		System.out.println(mediaHomens);
		sc.close();

	}

}
