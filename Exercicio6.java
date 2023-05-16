import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        
        System.out.println("Intervalo entre dois numeros inteiros.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o primeiro número inteiro: ");
        int numeroUm = scanner.nextInt();
        System.out.println("\nDigite o segundo número inteiro: ");
        int numeroDois = scanner.nextInt();

        if(numeroUm < numeroDois){
            int inicio = numeroUm + 1;
            while (numeroDois > inicio) {
                System.out.println(inicio);
                inicio++;
            }
        }else if(numeroUm > numeroDois){
            int inicio = numeroDois + 1;
            while(numeroUm > inicio){
                System.out.println(inicio);
                inicio ++;
            }
        }else {
            System.out.println("os numeros são iguais.");
        }
        scanner.close();
    }
}
