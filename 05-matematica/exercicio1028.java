// Problema 1028 - Figurinhas
// https://judge.beecrowd.com/pt/problems/view/1028
// Observações: Nenhuma

import java.util.Scanner;
import java.io.IOException;

public class exercicio1028 {
    
    public static void main(String[] args) throws IOException{
        
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int i = 0; i < N; i++){
            int F1 = scanner.nextInt();
            int F2 = scanner.nextInt();
            int aux = 0;

            if (F2 > F1){
                aux = F1;
                F1 = F2;
                F2 = aux;
            }
        
            int resto = 1;
            while(resto > 0){
                resto = F1 % F2;
                F1 = F2;
                F2 = resto;
            }
            System.out.println(F1);
        }
        scanner.close();
    
    }
}
