import java.util.Locale;
import java.util.Scanner;

public class exercicioifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		 if (x <0) {
			 System.out.println("Negativo");
		 } 
		 else { System.out.println("Não Negativo");
		 }

		
		sc.close();
			}
}
