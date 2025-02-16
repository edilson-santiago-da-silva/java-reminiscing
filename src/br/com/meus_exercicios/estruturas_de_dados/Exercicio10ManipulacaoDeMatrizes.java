package br.com.meus_exercicios.estruturas_de_dados;

import java.util.Scanner;

public class Exercicio10ManipulacaoDeMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 3; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


