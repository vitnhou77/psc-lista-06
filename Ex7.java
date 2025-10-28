import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("\nNúmeros digitados:");
        for (int n : numeros) System.out.print(n + " ");

        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        input.close();
    }
}
