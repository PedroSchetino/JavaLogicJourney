package src.logica;

public class mediaNotas {
    public static void main(String[] args) {
        double nota1 = 8.3;
        double nota2 = 6.4;
        double media = (nota1 + nota2) / 2;

        String resultado = String.format("%.2f", media);
        System.out.println(resultado);

    }
}
