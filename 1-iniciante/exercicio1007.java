// Problema 1007 - Diferença
// https://judge.beecrowd.com/pt/problems/view/1007
// Observações: Nenhuma

import java.io.IOException;
import java.util.Scanner;

public class exercicio1007 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        
        scanner.close();

        int DIFERENCA = (A*B - C*D);
        
        System.out.printf("DIFERENCA = %d\n", DIFERENCA);

    }
}
