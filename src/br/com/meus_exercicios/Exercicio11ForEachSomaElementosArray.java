package br.com.meus_exercicios;

import java.util.Scanner;

public class Exercicio11ForEachSomaElementosArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] n = new int[3];
        int soma = 0;

        for (int i = 0; i < n.length; i++ ){
            System.out.print("Digite o " + (i + 1) + "º: ");
            n[i] = sc.nextInt();
        }
        for (int obj : n) {
            soma += obj;
        }
        System.out.println("Soma dos números digitados: " + soma);
        sc.close();
    }
}



