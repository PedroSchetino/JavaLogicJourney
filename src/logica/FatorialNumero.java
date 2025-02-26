package src.logica;

import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Calculo fatorial---");
        System.out.println("Digite um numero a ser calculado: ");
        int numero = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("Resultado do fatorial: " + fatorial);
    }
}
