package br.com.meus_exercicios.estruturas_de_controles;

import java.util.Scanner;

public class Exercicio4EstruturaRepetitivaLoopWhileNumerosInteirosSoma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números inteiros no loop, quando quiser teminar o loop digite zero e verá a soma dos números digitados.");
        int n = 1;
        int cont = 1;
        int soma = 0;
        while (n != 0){
            System.out.print(cont + "° número: ");
            n = sc.nextInt();
            soma += n;
            cont += 1;
        }
        System.out.println("A soma dos números digitados foi: " + soma);
        sc.close();
    }
}
