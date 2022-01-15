import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int posicao = 0;
        
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        
        for (int i = 0; i < TOPS.length; i++) {
          if (TOPS[i] - N >= 0) {
            System.out.println("Top " + TOPS[i]);
            break;
          }
        }
        scan.close();
      }
  }