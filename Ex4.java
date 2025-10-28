import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] letras = new char[10];
        int contadorConsoantes = 0;

        for (int i = 0; i < letras.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º caractere: ");
            letras[i] = input.next().toLowerCase().charAt(0);

            if (letras[i] >= 'a' && letras[i] <= 'z' &&
                letras[i] != 'a' && letras[i] != 'e' &&
                letras[i] != 'i' && letras[i] != 'o' && letras[i] != 'u') {
                contadorConsoantes++;
            }
        }

        System.out.println("\nConsoantes lidas:");
        for (char c : letras) {
            if (c >= 'a' && c <= 'z' &&
                c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.print(c + " ");
            }
        }

        System.out.println("\nTotal de consoantes: " + contadorConsoantes);

        input.close();
    }
}
