// Problema 1026 - Carrega ou não Carrega?
// https://judge.beecrowd.com/pt/problems/view/1026
// Observações: Nenhuma

import java.util.Scanner;
import java.io.IOException;

public class exercicio1026 { 

    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            
            


            int resultado = num1 ^ num2; 
            
            System.out.println(resultado);
        }
        
        scanner.close();
    }
}
    