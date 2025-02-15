package src.logica;

public class conversorDolaReal {
    public static void main(String[] args) {
        double valorDolar = 20;
        double valorReal = 5.8;
        double conversao = valorDolar * valorReal;

        String convertidoReal = String.format("Conversao de $20.00 dolares para reais é: R$ %.2f", conversao);

        System.out.println(convertidoReal);

    }
}
