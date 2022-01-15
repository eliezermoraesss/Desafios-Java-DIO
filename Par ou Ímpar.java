import java.io.IOException;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 0; i < N; i++) {
    	  int X = leitor.nextInt();
    	  if (X != 0) {
    		String result1 = (X % 2 == 0) ? "EVEN " : "ODD ";
    		String result2 = (X < 0) ? "NEGATIVE" : "POSITIVE";
    		System.out.println(result1 + result2);
    	  } else {
    	    System.out.println("NULL");
    	  }
    	}
	}
}