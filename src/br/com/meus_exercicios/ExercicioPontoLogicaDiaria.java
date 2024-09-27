package br.com.meus_exercicios;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ExercicioPontoLogicaDiaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        LocalDateTime h = LocalDateTime.now();
        LocalDateTime entrada = null, intS = null, intE = null, saida = null;
        System.out.println("Digite a opção: \n" +
                "1 - Entrada \n" +
                "2 - Intervalo Saída \n" +
                "3 - Intervalo Entrada \n" +
                "4 - Saída \n");
        
        int op = sc.nextInt();

        if (op == 1){
           entrada = h;
        }
        if (op == 2){
            intS = h;
        }
        if (op == 3){
            intE = h;
        }
        if (op == 4){
            saida = h;
        }
        System.out.println("Resumo do dia:\n" +
                "Entrada às " + entrada +
                "\nIntervalo Saída às " + intS +
                "\nIntervalo Entrada às " + intE +
                "\nSaída às " + saida);
    }
}
