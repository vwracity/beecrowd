// Problema 1006 - Média 2
// https://judge.beecrowd.com/pt/problems/view/1006
// Observações: Nenhuma

import java.util.Scanner;
import java.io.IOException;

public class exercicio1006{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double A,B,C, MEDIA;

        A = scanner.nextDouble(); //Peso 2
        B = scanner.nextDouble(); //Peso 3
        C = scanner.nextDouble(); //Peso 5

        scanner.close();
        
        MEDIA = ((A * 2) + (B * 3) + (C * 5))/10;
        
        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }
}