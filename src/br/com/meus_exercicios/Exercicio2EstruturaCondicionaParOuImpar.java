package br.com.meus_exercicios;

import java.util.Scanner;

public class Exercicio2EstruturaCondicionaParOuImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro para saber se ele é par ou ímpar: ");
        int n1 = sc.nextInt();

        if (n1 % 2 ==0){
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }
        sc.close();
    }
}
