// Problema 1026 - Carrega ou não Carrega?
// https://judge.beecrowd.com/pt/problems/view/1026
// Observações: Nenhuma

import java.util.Scanner;
import java.io.IOException;

public class exercicio1026 {

    public static void main(String[] args) throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            long somaMofiz = somaMofiz(converteBinario(num1), converteBinario(num2));
            System.out.println(somaMofiz);
        }
            scanner.close();
    }

    public static long converteBinario(int a){
        
        // a = dividendo
        StringBuilder sb = new StringBuilder();

        while(a > 1){
            sb.append(a%2);
            a = a/2;
        } 
        sb.append(1);


        String binarioS = sb.reverse().toString();
        long binario = Integer.parseInt(binarioS);

        return binario;
    }
    
    public static long somaMofiz(long a, long b){
        
        //conta mofiz
        long soma =  a + b;
        String somaString = String.valueOf(soma);
        int tamanhoString = somaString.length();
        StringBuilder sb = new StringBuilder(somaString);
        

        for (int i = 0; i < tamanhoString; i++){
            if (somaString.charAt(i) == '2'){
                sb.setCharAt(i, '0');
            } 
        }
        
        // binario p decimal
        somaString = sb.toString();
        int expoente = 0;
        soma = 0;
        

        for (int i = tamanhoString - 1; i >= 0 ; i--){
            int algarismo = Character.getNumericValue(somaString.charAt(i)); 
            soma += algarismo * Math.pow(2, expoente);
            expoente ++;
        }

        return soma;
    }
}