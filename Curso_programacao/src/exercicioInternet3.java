import java.util.Locale;
import java.util.Scanner;

public class exercicioInternet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double  S1, S2, S3, S4, media;
		
		S1 = 100.00;
		S2 = 200.00;
		S3 = 150.00;
		S4 = 200.00;
		
		media = (S1+S2+S3+S4) / 4;
		System.out.println(media);
		
		
		
		sc.close();
	}

}
