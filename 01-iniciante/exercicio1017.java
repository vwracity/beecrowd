// Problema 1017 - Gasto de Combustível
// https://judge.beecrowd.com/pt/problems/view/1017
// Observações: Nenhuma

import java.util.Scanner;
import java.io.IOException;


public class exercicio1017 {
    public static void main(String[] args) throws IOException{

        int LitrosPorKm = 12;
        
        Scanner scanner = new Scanner(System.in);
        
        int horas = scanner.nextInt();
        int velocidade = scanner.nextInt();

        scanner.close();

        double litros = (horas * velocidade)/(double)LitrosPorKm;

        System.out.printf("%.3f\n", litros);
        

    }    
}
