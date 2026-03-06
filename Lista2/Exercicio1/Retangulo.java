package Exercicio1;

import java.util.Scanner;
public class Retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da Base: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor da Altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * ( base + altura);

        System.out.println("Valor da area: "+ area);
        System.out.println("Valor da perimetro: "+ perimetro);

        sc.close();
    }
}