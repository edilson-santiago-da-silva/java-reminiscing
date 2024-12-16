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

        LocalTime entryTime = LocalTime.parse(entry, HHmmFormatter);
        LocalTime exitTime = LocalTime.parse(exit, HHmmFormatter);

        //minutos extras
        long minTotal = Duration.between(entryTime, exitTime).toMinutes();
        long minExtra = 0L;

        if(minTotal > 500 ){
            minExtra = minTotal - 500;
        }
        System.out.println("Minutos trabalhados : " + minTotal);
        System.out.println("Minutos extras: " + minExtra);

        //tolerância para atrasos
        LocalTime entryPattern = LocalTime.of(10,0);
        int tolerance = 10;

        boolean entryOk = isWhithinTolerance(entryPattern, entryTime, tolerance);
        System.out.println("Entrada: " + (entryOk ? "No horário" : "Atrasado"));

    }

    public static boolean isWhithinTolerance(LocalTime entryPattern, LocalTime RealHour, int toleranceMin){
        long dif = Duration.between(entryPattern, RealHour).toMinutes();
        return dif >= 0 && dif <= toleranceMin;
    }

}
