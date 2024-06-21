package br.com.meus_exercicios;

import java.util.Scanner;

public class Exercicio6ManipulacaoDeStringsVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        frase = frase.toLowerCase();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++ ){
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                cont += 1;
            }
        }
        System.out.println("Números de vogais: " + cont);

        sc.close();
    }
}
