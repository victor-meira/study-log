package TiposDeDados;
import java.util.Scanner;

public class DesempenhoAcademico {
    public static void main(String[] args) {

        // Constantes para a situação acadêmica
        final double NOTA_MINIMA = 6.0;

        // Constantes para os sinalizadores bitwise
        final int APROVADO = 1;      // 001
        final int RECUPERACAO = 2;   // 010
        final int DESTAQUE = 4;      // 100

        String situacao;
        int sinalizadores = 0;

        var scanner = new Scanner(System.in);

        // Inputs
        System.out.println("Informe o nome do(a) estudante:");
        var nomeEstudante = scanner.next();

        System.out.println("Informe a primeira nota avaliativa:");
        var notaPrimeira = scanner.nextDouble();

        System.out.println("Informe a segunda nota avaliativa:");
        var notaSegunda = scanner.nextDouble();

        System.out.println("Informe a terceira nota avaliativa:");
        var notaTerceira = scanner.nextDouble();

        // Cálculo da média
        var media = (notaPrimeira + notaSegunda + notaTerceira) / 3;

        // Validação da situação
        if (media >= NOTA_MINIMA) {
            situacao = "Aprovado";
            sinalizadores |= APROVADO;
        } else if (media >= 5.5) {
            situacao = "Recuperação";
            sinalizadores |= RECUPERACAO;
        } else {
            situacao = "Reprovado";
        }

        // Sinalizador adicional para médias altas
        if (media >= 9.0) {
            sinalizadores |= DESTAQUE;
        }

        // Relatório
        System.out.println("\n=== RELATÓRIO ===");
        System.out.printf("Estudante: %s%n", nomeEstudante);
        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Situação: %s%n", situacao);

        if (media >= NOTA_MINIMA) {
            System.out.printf(
                    "Pontos acima da média mínima: %.2f%n",
                    media - NOTA_MINIMA
            );
        } else {
            System.out.printf(
                    "Pontos para atingir a média mínima: %.2f%n",
                    NOTA_MINIMA - media
            );
        }

        // Verificação dos sinalizadores com AND bitwise
        System.out.println("\n=== SINALIZADORES BITWISE ===");

        if ((sinalizadores & APROVADO) != 0) {
            System.out.println("Sinalizador: aprovado");
        }

        if ((sinalizadores & RECUPERACAO) != 0) {
            System.out.println("Sinalizador: recuperação");
        }

        if ((sinalizadores & DESTAQUE) != 0) {
            System.out.println("Sinalizador: destaque acadêmico!");
        }

        System.out.printf("Valor dos sinalizadores: %d%n", sinalizadores);

        scanner.close();
    }
}
