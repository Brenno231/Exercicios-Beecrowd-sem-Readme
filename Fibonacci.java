
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int termo1 = 0,termo2 = 1,termoFim = 1;
        System.out.print(termo1);
        for(int i = 1;i < n; ++i){
            System.out.print(" "+termo2);
            termo1 = termo2;
            termo2 = termoFim;
            termoFim = termo1 + termo2;
        }
        System.out.println();
    }
}
