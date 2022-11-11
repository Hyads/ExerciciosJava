import java.util.Locale;
import java.util.Scanner;

public class exercicioSwitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch  (x) {
		case 1:
			dia = "segunda";
			break;
		case 2:
			dia = "terça";
			break;
		case 3:
			dia = "quarta";
			break;
		case 4:
			dia = "quinta";
			break;
		case 5:
			dia = "sexta";
			break;
		case 6:
			dia = "sabado";
			break;
		case 7:
			dia = "domingo";
			break;
			
			default: dia = "invalido";
			break;
		}
		
		 
		
		
		
		sc.close();
	}

}
