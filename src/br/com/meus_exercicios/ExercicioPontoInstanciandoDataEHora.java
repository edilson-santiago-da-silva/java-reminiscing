package br.com.meus_exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExercicioPontoInstanciandoDataEHora {
    public static void main(String[] args) {
        // Define o formato da data e hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // pega data atual
        LocalDateTime d = LocalDateTime.now();

        // Exibe a data e hora formatadas
        System.out.println("Data e hora customizada: " + d.format(formatter));
    }
}
