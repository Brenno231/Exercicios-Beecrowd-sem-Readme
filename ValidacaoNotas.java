
import java.util.Scanner;

public class ValidacaoNotas{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1 = ler.nextDouble();
        while(n1 < 0 || n1 > 10){
            System.out.println("nota invalida");
            n1 = ler.nextDouble();
        }
        double n2 = ler.nextDouble();
        while(n2 < 0 || n2 > 10){
            System.out.println("nota invalida");
            n2 = ler.nextDouble();
        }
        double media = (n1 + n2) / 2;
        System.out.printf("media = %.2f",media);        
    }
}