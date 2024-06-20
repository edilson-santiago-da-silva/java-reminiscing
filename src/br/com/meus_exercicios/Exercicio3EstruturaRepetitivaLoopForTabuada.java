package br.com.meus_exercicios;

import java.util.Scanner;

public class Exercicio3EstruturaRepetitivaLoopForTabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada do mesmo até o 10 : ");
        int n = sc.nextInt();

        System.out.println("Tabuada do número " + n + ".");
        for (int i=0; i<=10; i++ ){
            System.out.println(i + " x " + n +" = " + n * i);
        }
        sc.close();
    }
}
