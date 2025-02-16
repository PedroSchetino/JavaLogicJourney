package src.logica;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número, seja ele negativo ou positivo: ");
        int numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("Número nulo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
    }
}
