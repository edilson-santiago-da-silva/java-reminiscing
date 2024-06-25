package br.com.meus_exercicios;


import java.util.Arrays;
import java.util.Scanner;

public class Exercicio8EstruturaRepetitivaArraysMaiorEMenorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vect = new int[5];

        for (int i=0 ; i <= 4; i++ ) {
            vect[i] = sc.nextInt();
        }

        int maior = vect[0] , menor = vect[0];

        for (int i = 0 ; i <= 4; i++){
            if (vect[i] >= maior ){
                maior = vect[i];
            }
            if (vect[i] <= menor ){
                menor = vect[i];
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Vetor completo --> " + Arrays.toString(vect));

        sc.close();
    }
}
