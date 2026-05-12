
import java.util.Scanner;

public class TipoDeCombustivel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int al = 0, gas = 0, die = 0;
        externo: while (n > 0) {
            switch (n) {
                case 1:
                    ++al;
                    break;
                case 2:
                    ++gas;
                    break;
                case 3:
                    ++die;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d\n", al, gas, die);
                    break externo;
            }
            n = ler.nextInt();
        }
        ler.close();
    }
}
