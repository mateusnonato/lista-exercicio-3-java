import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Progama para verificação de numero.");
        System.out.println("\nInforme um numero de 1 a 10:");
        int numeroInformado = scanner.nextInt();

        while ((numeroInformado < 0) || (numeroInformado > 10)){
            System.out.println("Entrada invalida!\nInforme outro número:");
            numeroInformado = scanner.nextInt();
        }
        System.out.println("Numero válido! O numero informado é: " + numeroInformado);

        scanner.close();
        }
    }
