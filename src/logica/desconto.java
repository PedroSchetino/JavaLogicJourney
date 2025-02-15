package src.logica;

public class desconto {
    public static void main(String[] args) {
        double precoOriginal = 19.78;
        double percentualDesconto = 10;
        double calculoDesconto = precoOriginal * (percentualDesconto / 100);
        double valorFinal = precoOriginal - calculoDesconto;

        String mensagem = String.format("Mega oferta de R$ %.2f para R$ %.2f", precoOriginal, valorFinal);
        System.out.println(mensagem);
        System.out.println("Aproveite!");
    }
}
