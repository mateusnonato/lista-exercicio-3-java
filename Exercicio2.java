import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        System.out.println("Cadastro de usuário e senha.");
            
            do{
                System.out.println("\nInforme o nome de usuário:");
                usuario = scanner.nextLine();
                System.out.println("Informe uma senha:");
                senha = scanner.nextLine();

                if(usuario.equals(senha)){
                    System.out.println("\nNão é possível cadastrar uma senha igual ao nome de usuário!");
                }
            }while(usuario.equals(senha));
        System.out.println("\nUsuário e senha cadastrados com sucesso!");
        scanner.close();
    }
}
