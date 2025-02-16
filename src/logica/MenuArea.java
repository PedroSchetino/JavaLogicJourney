package src.logica;

import java.util.Scanner;

public class MenuArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("----MENU----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. sair");
            System.out.println("Escolha uma das opções");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o raio do quadrado: ");
                double lado = sc.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.printf("Área do quadrado: %.2f%n" , areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do círculo: ");
                double raio = sc.nextDouble();

        /* Classes math:
           Math.PI é uma constante
           Math.pow(raio, 2) é um metodo q eleva o raio²
         */
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.printf("Área do círculo: %.2f%n" , areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
