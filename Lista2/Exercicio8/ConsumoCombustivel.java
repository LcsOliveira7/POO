package Exercicio8;

import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a Distancia percorrida em kilometros: ");
        double KmPercorrido = sc.nextDouble();
        System.out.print("Digite o combustivel gasto em litros : ");
        double CombustivelGasto = sc.nextDouble();

        double ConsumoMedio = KmPercorrido/CombustivelGasto;

        System.out.printf("O Consumo medio foi de : %.2f Km/L%n", ConsumoMedio);
        
        
        sc.close();
    }
}
