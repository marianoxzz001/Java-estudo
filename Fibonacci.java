public class Fibonacci {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        System.out.println("Os " + N + " primeiros números da sequência de Fibonacci são:");

        int a = 0, b = 1;

        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        scanner.close();
    }
}
