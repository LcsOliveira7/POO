package Exercicio3;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i == 12) {
                break;
            }

            if (i % 3 == 0) {
                System.out.println("Múltiplo de 3");
                continue;
            }
            System.out.println(i);
        }
    }
}
