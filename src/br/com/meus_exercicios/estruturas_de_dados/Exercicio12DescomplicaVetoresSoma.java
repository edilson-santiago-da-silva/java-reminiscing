package br.com.meus_exercicios.estruturas_de_dados;

import java.util.Scanner;

public class Exercicio12DescomplicaVetoresSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vector = new int[50];
        int media, soma = 0;

        for (int i = 0; i <= 49; i ++ ){
            System.out.print("Digite um número? ");
            vector[i] = sc.nextInt();
            soma += vector[i];
        }

        media = soma / 50;


        System.out.println("A média das 50 notas digitadas é: " + media);
        sc.close();
    }
}
