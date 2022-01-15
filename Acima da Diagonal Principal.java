import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        char O = leitor.next().charAt(0);
        double[][] M = new double [12][12];
        double soma = 0;
        
        for (int i = 0; i < M.length; i++){       //linha
          for (int j = 0; j < M[i].length; j++) { //coluna
              M[i][j] = leitor.nextDouble();
            } 
          }
        
        for (int i = 0; i < M.length; i++){       //linha
          for (int j = 0; j < M[i].length; j++) { //coluna
            if (j > i) {
              soma += M[i][j];
            }
          }
        }

        if (O == 'S') {
          System.out.printf("%.1f\n", soma);
        } else if (O == 'M') {
          System.out.printf("%.1f\n", (soma / 66)); // 66 = número de elementos acima da diagonal principal
        }
    }
}