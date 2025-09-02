
    import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int valor = scanner.nextInt();

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Notas necessárias para R$ " + valor + ":");

        for (int nota : notas) {
            int quantidadeNotas = valor / nota;
            valor = valor % nota;

            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " nota(s) de R$ " + nota);
            }
        }

        scanner.close();
    }
}

