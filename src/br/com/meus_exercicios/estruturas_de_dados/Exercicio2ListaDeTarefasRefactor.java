package br.com.meus_exercicios.estruturas_de_dados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2ListaDeTarefasRefactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int op ;
        String tarefa;
        int index;

        do {
            System.out.print("Digite a opção: [1] Adicionar, [2] Remover, [3] Listar, [4] Sair: ");
            try {
                op = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número.");
                continue;
            }
            if ( op == 1){
                System.out.print("Digite a tarefa: ");
                tarefa = sc.nextLine();
                list.add(tarefa);
            } else if (op == 2) {
                if(list.isEmpty()){
                    System.out.println("A lista está vazia!");
                } else {
                    listarTarefas(list);
                    System.out.print("Digite o número da tarefa para remover:");
                    index = sc.nextInt();
                    sc.nextLine();

                    if (index >= 0 && index < list.size()){
                        list.remove(index);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Tarefa inexistente!");
                        System.out.println(list.size());
                    }
                }
            } else if (op == 3 ) {
               listarTarefas(list);

            } else if (op == 4){
                System.out.println("Finalizando o programa!");
                sc.close();
                break;
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        } while (true);

    }

    public static void listarTarefas(List<String> list){
        if (list.isEmpty()){
            System.out.println("A lista de tarefas está vazia");
        } else {
            for(int i = 0 ; i < list.size() ; i++){
                System.out.println(i + " - " + list.get(i));
            }
        }
    }
}
