import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[20];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                pares.add(numeros[i]);
            } else {
                impares.add(numeros[i]);
            }
        }

        System.out.println("\nVetor original:");
        for (int n : numeros) System.out.print(n + " ");

        System.out.println("\nPares:");
        for (int n : pares) System.out.print(n + " ");

        System.out.println("\nÍmpares:");
        for (int n : impares) System.out.print(n + " ");

        input.close();
    }
}
