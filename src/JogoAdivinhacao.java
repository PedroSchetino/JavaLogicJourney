package src;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativa = 0;
        int numeroDigitado = 0;

        // loop "while" com a variavel delcarando até 5 tentativas
        while (tentativa < 5) {
            System.out.println("Adivinhe o número secreto entre 0 e 100: ");
            numeroDigitado = sc.nextInt();
            tentativa++; // contador para repetir até as 5 tentativas

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns! Você adivinhou.");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
        }

        // se as 5 tentativas forem diferente do numero gerado, falhou na adivinhação
        if (tentativa == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar as 5 tentativas.");
        }
    }
}
