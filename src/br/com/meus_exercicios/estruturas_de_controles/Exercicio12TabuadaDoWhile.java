package br.com.meus_exercicios.estruturas_de_controles;

import java.util.Scanner;

public class Exercicio12TabuadaDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numerotabuada = sc.nextInt();

        int i = 1;
        do {
            System.out.println(numerotabuada + "X" + i +" = " + (i * numerotabuada) );
            i++;
            if (i == 11){
                System.out.print("Digite um número: ");
                numerotabuada = sc.nextInt();
                i = 1 ;
                if (numerotabuada < 0){
                    sc.close();
                    System.out.println("encerrando o programa.");
                    return;
                }
            }
        } while (true);

    }
}
