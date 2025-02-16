package src.logica;

import java.util.Scanner;

public class CompararNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 números");
        System.out.println("Número 1: ");
        int numero1 = sc.nextInt();
        System.out.println("Número 2: ");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 < numero2) {
            System.out.println("Número 1 é menor que o número 2");
        } else {
            System.out.println("Número 1 é maior que o número 2");
        }
    }
}
