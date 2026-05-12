
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();
        double soma = 0,media = 0;
        for(int i = 1; idade > 0; ++i){
            soma += idade;
            idade = ler.nextInt();
            media = soma / i;
        }
        System.out.printf("%.2f\n",media);
    }
}
