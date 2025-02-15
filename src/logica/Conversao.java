package src.logica;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o usuario para entrar com valor em grau celcius
        System.out.println("Digite a temperatura em Celsius: ");

        //Lê a temperatura digitada pelo usuario
        double temperaturaCelsius = scanner.nextDouble();

        // Converte para fahrenheit
        double resultadoFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Variavel String formatada em mensagem
        String mensagem = String.format("A temperatura de %.2f Celsius equivale à Fahrenheit: %.2f", temperaturaCelsius, resultadoFahrenheit);
        System.out.println(mensagem);

        // Fechamento do Scanner pra liberar recursos
        scanner.close();
    }
}
