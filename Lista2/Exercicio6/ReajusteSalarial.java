package Exercicio6;
import java.util.Scanner;
public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do Salario : ");
        double salario = sc.nextDouble();
        System.out.print("declare o perdentual de aumento para o reajuste salarial: ");
        double percentualAumento = sc.nextDouble();

        double Aumento = salario*(percentualAumento/100);
        double NovoSalario = salario + (salario*(percentualAumento/100));

        System.out.println("Valor do salario inicial: "+ salario);
        System.out.println("Valor do Percentual de aumento: "+ percentualAumento);
        System.out.println("Valor do aumento: "+ Aumento);
        System.out.println("Valor do salario reajustado: "+ NovoSalario);


        sc.close();
    }
}
