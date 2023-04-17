package LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio5DoWhile {

public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero, somaPositivos = 0;
        
        do {
            System.out.print("Digite um número: ");
            numero = input.nextInt();
            
            if (numero > 0) {
                somaPositivos += numero;
            }
            
        } while (numero != 0);
        
        System.out.println("A soma dos números positivos é: " + somaPositivos);
        
        input.close();
    }
}
