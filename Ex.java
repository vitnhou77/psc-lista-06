import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = input.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("\nNotas digitadas:");
        for (double n : notas) {
            System.out.print(n + " ");
        }

        System.out.println("\nMédia: " + media);

        input.close();
    }
}
