package br.com.meus_exercicios.estruturas_de_dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1ArrayListNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();
        for (int i=1 ; i < 11; i++) {
            System.out.print("Digite o " + i + " número:");
            Integer n = sc.nextInt();
            listNumber.add(n);
        }
        for (int i=9 ; i >= 0; i--) {
            System.out.print(listNumber.get(i));
        }
        sc.close();
    }
}
