// Problema 1008 - Salário
// https://judge.beecrowd.com/pt/problems/view/1008
// Observações: Nenhuma

import java.io.IOException;
import java.util.Scanner;

public class exercicio1008 {

    public static void main(String[] args) throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        
        int Func = scanner.nextInt();
        int horas = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        scanner.close();

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", Func, valorHora * horas);

    }
}

