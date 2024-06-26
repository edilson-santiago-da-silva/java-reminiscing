package br.com.meus_exercicios;

import java.util.Scanner;

public class Exercicio9EstruturaCondicionalNumerosPrimos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para testar se ele é primo:");
        int n = sc.nextInt();

        if ((n != 2  && n != 3) && (n % 2 == 0 || n % 3 == 0 )){
            System.out.println("O Número não é primo");
        }
        else {
            System.out.println("Número Primo");
        }

        sc.close();
    }
}
