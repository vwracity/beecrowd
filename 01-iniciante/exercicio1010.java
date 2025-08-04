// Problema 1010 - Cálculo Simples
// https://judge.beecrowd.com/pt/problems/view/1010
// Observações: Nenhuma

import java.util.Scanner;
import java.io.IOException;



public class exercicio1010 {
    public static void main (String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        
        //Peca 2
        int cod = scanner.nextInt();
        int quant = scanner.nextInt();
        double preco = scanner.nextDouble();

        //Peca 2
        int cod2 = scanner.nextInt();
        int quant2 = scanner.nextInt();
        double preco2 = scanner.nextDouble();

        scanner.close();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", quant * preco 
                                                        + quant2 * preco2);

    }
}
