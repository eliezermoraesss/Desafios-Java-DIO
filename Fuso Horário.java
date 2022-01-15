import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horaSaida = sc.nextInt();
		int tempoViagem = sc.nextInt();
		int fuso = sc.nextInt();
		
		int ajuste = horaSaida + tempoViagem;
		
		if (ajuste > 23) {
		  ajuste -= 24;
		  ajuste += fuso;
		  if (ajuste < 0) {
		    ajuste += 24;
		  }
		} else if (ajuste <= 23) {
		  ajuste += fuso;
		  if (ajuste < 0) {
		    ajuste += 24;
		  }
		}
		
		System.out.println(ajuste);
		
		sc.close();
	}
}