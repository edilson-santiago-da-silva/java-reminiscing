package br.com.meus_exercicios.estruturas_de_controles;

import java.util.Scanner;

public class Exercicio10LoopForFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = sc.nextInt();

        sc.close();

        int fatorial = 1;

        for (int i = 1; i <= n; i++){
            fatorial *= i;
        }

        System.out.println("Fatorial do número " + n + " é " + fatorial);

    }
}
