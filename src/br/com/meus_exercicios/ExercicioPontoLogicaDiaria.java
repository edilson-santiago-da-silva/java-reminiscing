package br.com.meus_exercicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ExercicioPontoLogicaDiaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entry, exit;

        DateTimeFormatter HHmmFormatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("DIGITAL POINT | DAY: " + LocalDateTime.now().format(dayFormatter) );
        System.out.println("Digite o formato válido HH:mm (24 Horas)");

        System.out.print("Entrada: ");
        entry = sc.nextLine();
        System.out.print("Saída: ");
        exit = sc.nextLine();

        LocalTime time1 = LocalTime.parse(entry, HHmmFormatter);
        LocalTime time2 = LocalTime.parse(exit, HHmmFormatter);

        //minutos extras
        long minTotal = Duration.between(time1, time2).toMinutes();
        long minExtra = 0L;

        if(minTotal > 500 ){
            minExtra = minTotal - 500;
        }
        System.out.println("Minutos trabalhados : " + minTotal);
        System.out.println("Minutos extras: " + minExtra);

        //considerando atrasos
        //if(entry > (entry + "00:10")){

    }

}
