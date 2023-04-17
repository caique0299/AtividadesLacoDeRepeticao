package LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio4While {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade, sexo, categoria;
        int backend = 0, mulheresFrontend = 0, homensMobile = 0, mulheresFullstack = 0;
        char continuar = 'S';
        
        while (continuar == 'S') {
            System.out.print("Digite a idade do colaborador: ");
            idade = sc.nextInt();
            
            System.out.print("Digite o sexo do colaborador (1-Masculino, 2-Feminino, 3-Outros): ");
            sexo = sc.nextInt();
            
            System.out.print("Digite a categoria do colaborador (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
            categoria = sc.nextInt();
            
            if (categoria == 1) {
                backend++;
            } else if (categoria == 2 && sexo == 2) {
                mulheresFrontend++;
            } else if (categoria == 3 && sexo == 1 && idade > 40) {
                homensMobile++;
            } else if (categoria == 4 && sexo == 2 && idade < 30) {
                mulheresFullstack++;
            }
            
            System.out.print("Deseja continuar a leitura dos dados de um novo colaborador? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);
        }
        
        System.out.println("Número de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("Número de mulheres desenvolvedoras Frontend: " + mulheresFrontend);
        System.out.println("Número de homens desenvolvedores Mobile maiores de 40 anos: " + homensMobile);
        System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulheresFullstack);
        
        sc.close();
	}
}
