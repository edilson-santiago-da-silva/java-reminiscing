package br.com.meus_exercicios;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ExercicioPontoLogicaDiaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entry, exit, exitInterval, entryInterval;

        LocalTime entryPattern = LocalTime.of(10,0);
        int tolerance = 0;
        int intervalPattern = 60;

        DateTimeFormatter HHmmFormatter = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("DIGITAL POINT | DAY: " + LocalDateTime.now().format(dayFormatter) );
        System.out.println("Digite o formato válido HH:mm (24 Horas)");

        System.out.print("Entrada: ");
        entry = sc.nextLine();
        System.out.print("Saída intervalo:");
        exitInterval = sc.nextLine();
        System.out.print("Entrada intervalo:");
        entryInterval = sc.nextLine();
        System.out.print("Saída: ");
        exit = sc.nextLine();

        LocalTime entryTime = LocalTime.parse(entry, HHmmFormatter);
        LocalTime exitTime = LocalTime.parse(exit, HHmmFormatter);
        LocalTime exitIntervalTime = LocalTime.parse(exitInterval, HHmmFormatter);
        LocalTime entryIntervalTime = LocalTime.parse(entryInterval, HHmmFormatter);

        //tolerância para atrasos
        long entryVerification = calculateEntry(entryPattern, entryTime, tolerance);
        System.out.println("Atraso na entrada em min: " + entryVerification);
        tolerance += (int) entryVerification;

        long intervalVerification = calculateInterval(exitIntervalTime, entryIntervalTime, intervalPattern);
        System.out.println("Atraso no intervalo em min: " + intervalVerification);
        tolerance += (int) intervalVerification;

        if (tolerance > 10){
            System.out.println("Desconto em Min na hora extra: " + tolerance);
        }

        //minutos extras
        long workload = 440L;
        long extraHours = 0L;

        long minWorked = calculateMinWorked(entryTime, exitIntervalTime, entryIntervalTime, exitTime);
        if(minWorked > workload){
            extraHours = minWorked - workload;
        }
        System.out.println("Minutos extras: " + extraHours);
    }

    public static long calculateEntry(LocalTime entryPattern, LocalTime RealHour, int toleranceMin){
        long dif = Duration.between(entryPattern, RealHour).toMinutes();
        if (dif > toleranceMin){
            return dif;
        }
        return 0;
    }

    public static long calculateInterval(LocalTime exitInterval, LocalTime entryInterval, int intervalPattern){
        long dif = Duration.between(exitInterval, entryInterval).toMinutes();
        if(dif > intervalPattern){
            return dif - intervalPattern;
        }
        return 0;
    }

    public static long calculateMinWorked(LocalTime entry, LocalTime exitInterval, LocalTime entryInterval, LocalTime exit ){
        long minTotal = Duration.between(entry, exit).toMinutes();
        long interval = Duration.between(exitInterval, entryInterval).toMinutes();
        return minTotal - interval;
    }

}
