 import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2) / 2;

        // Exibe a média
        System.out.printf("Média: %.2f\n", media);

        // Condicional para verificar aprovação
        if (media >= 7.0) {
            System.out.println("Status: Aprovado ✅");
        } else if (media >= 5.0) {
            System.out.println("Status: Recuperação ⚠️");
        } else {
            System.out.println("Status: Reprovado ❌");
        }

        scanner.close();
    }
}
