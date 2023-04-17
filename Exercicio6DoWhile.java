package LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio6DoWhile {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int count = 0;
        int num;

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num % 3 == 0 && num != 0) {
                soma += num;
                count++;
            }

        } while (num != 0);

        if (count != 0) {
            double media = (double) soma / count;
            System.out.printf("A média de todos os números múltiplos de 3 é: %.1f%n", media);
        } else {
            System.out.println("Não foi digitado nenhum número múltiplo de 3.");
        }

        sc.close();
    }
}
