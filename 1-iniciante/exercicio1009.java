// Problema 1009 - Salário
// https://judge.beecrowd.com/pt/problems/view/1009
// Observações: Nenhuma

import java.io.IOException;
import java.util.Scanner;

public class exercicio1009 {
    
    public static void main(String[] args) throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        
        String Nome = scanner.nextLine();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        
        scanner.close();

        System.out.printf("TOTAL = R$ %.2f\n", salario +(vendas * 0.15));

    }

}
