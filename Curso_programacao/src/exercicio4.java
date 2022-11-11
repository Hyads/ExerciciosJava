import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double number = sc.nextDouble();
		double horas = sc.nextDouble();
		double valorhora = sc.nextDouble();
		
		double salario;
		 salario = horas * valorhora ;
		
		
		System.out.println("Numero Funcionario = " + number);
		System.out.printf("Salario = U$ %.2f%n ", + salario);
		
		 
		
		sc.close();
		}
	}


