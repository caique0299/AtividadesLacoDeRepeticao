package LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio2For {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int pares = 0;
	        int impares = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("Digite o %dº número: ", i);
	            int numero = scanner.nextInt();

	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	        System.out.printf("\nTotal de números pares: %d\n", pares);
	        System.out.printf("Total de números ímpares: %d\n", impares);
	 }
}
