
import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int X = ler.nextInt();
        int Y = ler.nextInt();
        for (int i = 1; i <= Y; ++i) {
            if (i % X == 0) {
                System.out.print(i);
                System.out.println();
            } else
                System.out.print(i + " ");
        }
        ler.close();
    }
}
