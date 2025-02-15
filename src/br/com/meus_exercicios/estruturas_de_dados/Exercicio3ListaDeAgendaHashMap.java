package br.com.meus_exercicios.estruturas_de_dados;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3ListaDeAgendaHashMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> agenda = new HashMap<>();

        int op;
        String nome, tel;

        do {
            System.out.print("Digite uma opção: [1] Adicionar, [2] Buscar, [3] listar, [4] Sair: ");
            try {
                op = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Tente novamente!");
                continue;
            }

            if(op == 1) {
                System.out.print("Digite o nome: ");
                nome = sc.nextLine();
                System.out.print("Digite o telefone: ");
                tel = sc.nextLine();

                agenda.put(nome, (tel));

                System.out.println("Contato adicionado com sucesso!");

            } else if (op == 2) {
                System.out.print("Digite o nome do contato para busca: ");
                nome = sc.nextLine();
                if (agenda.containsKey(nome)){
                    System.out.println("resultado da busca: " + nome + " = " + agenda.get(nome));
                }
            } else if (op == 3){
                for (String keynome : agenda.keySet()){
                    String value = agenda.get(keynome);
                    System.out.println(keynome + " = " + value);
                }
            } else if(op == 4){
                sc.close();
                System.out.println("Finalizando o programa");
                break;
            }else {
                System.out.println("Opção inválida, tente novamente!");
            }
        } while(true);
    }
}
