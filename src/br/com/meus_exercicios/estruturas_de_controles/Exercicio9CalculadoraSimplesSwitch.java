package br.com.meus_exercicios.estruturas_de_controles;

import java.util.Scanner;

public class Exercicio9CalculadoraSimplesSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextInt();
        System.out.print("Digite a operação(+ , - , * , /):");
        String op = sc.next();

        sc.close();

        double calculo = 0;

        switch (op){
            case "+":
               calculo = n1 + n2;
               break;
            case "-":
                calculo = n1 - n2;
                break;
            case "*":
                calculo = n1 * n2;
                break;
            case "/":
                calculo = n1 / n2;
                break;
            default:
                System.out.print("Operação inválida");
        }

        System.out.print("Resultado: " + calculo);
    }
}
