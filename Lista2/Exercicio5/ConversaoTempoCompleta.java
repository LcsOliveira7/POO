package Exercicio5;

import java.util.Scanner;

public class ConversaoTempoCompleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Tempo em segundos: ");
        int TotalSegundos = sc.nextInt();

        int horas = TotalSegundos/3600;
        int minutos = TotalSegundos/60;
        int SegundosRestantes = TotalSegundos%60;

        if (TotalSegundos > 3600 ) {
            minutos = (TotalSegundos - 3600)/60;
        }

        System.out.println(TotalSegundos+" Segundos Correspondem a "+ horas +" horas "+ minutos +" Minutos "+ SegundosRestantes +" Segundos ");

        sc.close();
    }
    
}

