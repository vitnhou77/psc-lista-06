import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] medias = new double[10];
        int aprovados = 0;

        for (int i = 0; i < medias.length; i++) {
            double soma = 0;
            System.out.println("\nAluno " + (i + 1) + ":");
            for (int j = 1; j <= 4; j++) {
                System.out.print("Digite a " + j + "ª nota: ");
                soma += input.nextDouble();
            }
            medias[i] = soma / 4;
            if (medias[i] >= 7.0) aprovados++;
        }

        System.out.println("\nMédias dos alunos:");
        for (double m : medias) System.out.println(m);

        System.out.println("\nAlunos com média >= 7.0: " + aprovados);

        input.close();
    }
}
