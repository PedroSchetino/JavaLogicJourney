package src.logica;

import java.util.Scanner;

public class TabuadaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("--Tabuada de 1 a 10--");
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        System.out.println("Tabuada do " + numero + " : ");

        /* LÓGICA DO CODIGO:
           i = 1 inicia a partir do 1
           1 < 10 limita a contagem até 10
           i++ contagem segue de 1 em 1
         */
        for (int i = 1; i < 10; i++) {

            /* LÓGICA:
               sout = imprime o número escolhido pelo usuario,
               i = em ordem sequencial do inicio ao limite
               (numero*i) = funcao que multiplica os valores
             */
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
