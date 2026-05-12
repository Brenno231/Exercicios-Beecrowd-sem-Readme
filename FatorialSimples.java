
import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        for(int i = (n - 1); i >= 1; --i){
            n *=  i;
        }
        System.out.println(n);
    }
}
