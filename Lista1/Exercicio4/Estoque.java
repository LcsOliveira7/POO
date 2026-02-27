package Exercicio4;

public class Estoque {
    public static void main(String[] args) {
        int estoque = 20;

        System.out.println(estoque--);
        System.out.println(estoque--);
        System.out.println(estoque--);

        System.out.println(estoque++);
        System.out.println(estoque++);
        System.out.println(estoque++);
        System.out.println(estoque++);
        System.out.println(estoque++);

        System.out.println(" O valor final do estoque e"+ estoque);
    }
}
