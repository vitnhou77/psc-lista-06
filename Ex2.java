import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            numeros[i] = input.nextDouble();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        input.close();
    }
}
