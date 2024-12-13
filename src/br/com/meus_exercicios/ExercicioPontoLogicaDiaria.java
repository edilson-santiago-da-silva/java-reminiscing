package br.com.meus_exercicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//        this.id = id;
//        this.workDay = workDay;
//        this.userName = userName;
//        this.entry = entry;
//        this.entryLaunch = entryLaunch;
//        this.exitLaunch = exitLaunch;
//        this.exit = exit;
//        this.user = user;

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

        //minutos trabalhados 500 com almoço.
        Long dif = Duration.between(time1, time2).toMinutes();

        System.out.println(dif);

    }

}
