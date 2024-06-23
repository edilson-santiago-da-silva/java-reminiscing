package br.com.meus_exercicios;

import java.util.Scanner;

public class Exercicio7EstruturaCondicionalMultiplasCondicoesIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade de 3 pessoas:");

        for (int i=1; i <= 3; i++ ){
            System.out.print(i + "° Pessoa: ");
            int p = sc.nextInt();

            if (p >= 0 && p <= 12 ){
                System.out.print(" --> A pessoa digitada é Criança \n");
            }
            if (p >= 13 && p <= 17 ){
                System.out.print(" --> A pessoa digitada é Adolescente \n");
            }
            if (p >= 18 && p <= 64 ){
                System.out.print(" --> A pessoa digitada é Adulta \n");
            }
            if (p >= 65 && p <= 120){
                System.out.print(" --> A pessoa digitada é Idosa \n");
            }
            if (p < 0 || p > 120){
                System.out.print("Idade inválida, digite a idade novamente a baixo. \n");
                i = i - 1;
            }

        }

    }
}
