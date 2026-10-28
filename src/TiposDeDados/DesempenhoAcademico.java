package TiposDeDados;
import java.util.Scanner;

public class DesempenhoAcademico {
    static void main(String[] args) {
        // Declaração de variáveis e de constantes
        String situacao;
        final double NOTA_MINIMA = 6.0;

        var scanner = new Scanner(System.in);

        // Inputs aplicados
        System.out.println("Informe o nome do(a) estudante: ");
        var nomeEstudante = scanner.next();
        System.out.println("Informe a primeira nota avaliativa ");
        var notaPrimeira = scanner.nextFloat();
        System.out.println("Informe a segunda nota avaliativa ");
        var notaSegunda = scanner.nextFloat();
        System.out.println("Informe a terceira nota avaliativa ");
        var notaTerceira = scanner.nextFloat();

        // Cálculo de média
        var media = (notaPrimeira + notaSegunda + notaTerceira)/3;

        // Validação situação do estudante
        if (media >= 6.0) {
            situacao = "Aprovado";
        } else if (media >= 5.5 && media <= 5.9) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        // Relatório
        System.out.println("=== RELATÓRIO ===");
        System.out.printf("Estudante: %s%n", nomeEstudante);
        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Situação: %s%n", situacao);
        if (media >= 6.0) {
            System.out.printf("Pontos acima da média mínima: %.2f%n", media - NOTA_MINIMA);
        } else {
            System.out.printf("Pontos para atingir a média mínima: %.2f%n", NOTA_MINIMA - media);
        }
    }
}
