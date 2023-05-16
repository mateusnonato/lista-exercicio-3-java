import java.util.Scanner;
public class Exercicio7 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de numeros pares e ímpares."); 
        int par = 0, impar = 0;

        for(int count = 1; count <= 10; count ++){

        System.out.println("\nDigite o " + count + "º número inteiro: ");
        int numero = scanner.nextInt();
     
        if (numero % 2 == 0){
            par ++;
        }else{
            impar ++;
        }
        }
        System.out.println("Números pares: " + par);
        System.out.println("Números ímpares: " + impar);
        scanner.close();
    }
}
