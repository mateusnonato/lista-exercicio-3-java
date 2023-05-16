import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Calculo da soma e média de 5 numeros.");

        System.out.println("\nDigite o 1º numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("\nDigite o 2º numero: ");
        double numero2 = scanner.nextDouble();
        System.out.println("\nDigite o 3º numero: ");
        double numero3 = scanner.nextDouble();
        System.out.println("\nDigite o 4º numero: ");
        double numero4 = scanner.nextDouble();
        System.out.println("\nDigite o 5º numero: ");
        double numero5 = scanner.nextDouble();

        // DUVIDA: É possível realizar o alocamento de valores de um array usando uma variavel inteira?

        /*
            double[] numero = new double[4];

            for(int count = 0; count < 5; count ++){
            int contador = 1;
            System.out.println("\nInforme o valor do " + contador + "º numero:");
            numero[count] = sc.nextDouble();
            contador ++;
        }
        */

        double soma = numero1 + numero2 + numero3 + numero4 + numero5;
        System.out.println("A soma dos numeros informados é: " + soma);
        System.out.println("A media dos nuemros informados é: " + soma/5);

        scanner.close();
    }
}
