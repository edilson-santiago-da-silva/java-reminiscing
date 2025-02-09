package br.com.meus_exercicios.estruturas_de_controles;

import java.util.Random;
import java.util.Scanner;

public class Exercicio11AdivinhacaoNumeroWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random g = new Random();

        int n = g.nextInt(100);

        System.out.print("Digite seu palmite: ");
        int p = sc.nextInt();

        while (p != n){
            if (p>n){
                System.out.println("O Número é menor. ");
            } else {
                System.out.println("O número é maior");
            }
            System.out.print("Digite seu palmite:");
            p = sc.nextInt();
        }
        System.out.println("Parabéns Você acertou!");
        sc.close();
    }
}
