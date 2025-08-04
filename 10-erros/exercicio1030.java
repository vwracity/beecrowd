// Problema 1030 - A Lenda de Flavious Josephus
// https://judge.beecrowd.com/pt/problems/view/1030
// Observações: Nenhuma

import java.io.IOException;
import java.util.Scanner;

public class exercicio1030 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int NC = scanner.nextInt();
        
        for (int i = 0; i < NC; i++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            
            boolean[] roda = new boolean[n];
            int mortos = 0;
            int j = k - 1; // elimina primeiro da roda.

            roda[j] = true;  
            int contador = 0; //Conta se já pulei a quantidade certa na roda para um individuo morrer.

            while (mortos < n){
                j++; // anda casa por casa na roda
                
                //reseta o j quando percorrer o vetor todo
                
                if(j > n - 1){
                    j = 0;
                }
                
                //checa se esta vivo, se tiver adiciona +1 no contador.
                System.out.println(j);
                if (!roda[j]){
                    contador++;
                    System.out.println("Contado: " + contador);
                    
                    //mata o individuo necessario e reinicia o contador.
                    if (contador == k){
                        roda[j] = true;
                        System.out.printf("Matou: %d\n", j);
                        contador = 0;
                        mortos ++;
                    }
                
                }

                //Achar o numero do ultimo sobrevivente.
                if (mortos == n - 1 && contador == 1){
                    System.out.println(j + 1);
                    mortos++;
                }
            }
        }
        scanner.close();

    }
}   
