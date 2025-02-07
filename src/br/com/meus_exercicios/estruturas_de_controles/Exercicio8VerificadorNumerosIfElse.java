package br.com.meus_exercicios.estruturas_de_controles;

import java.util.Scanner;

public class Exercicio8VerificadorNumerosIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = sc.nextInt();

        String parOuImpar = (n%2 ==0 ) ? "par" : "ímpar"; // Operador ternário ()?:
        String verif;

        if ( n > 0){
            verif = "Positivo";
        } else if ( n < 0){
            verif = "negativo";
        } else {
            verif = "Zero";
        }
        System.out.println("O número é " + verif + " e " + parOuImpar);
    }
}
