import java.util.Scanner;

public class Exercicio3 {
        public static void main(String[] args) {
            
        
        Scanner scanner = new Scanner(System.in);
        int idade;
        Double salario;
        String nome, sexo, estadoCivil;
        
        System.out.println("Programa para ler e validar informações.");

        System.out.println("Favor informar seu nome (acima de 3 caracteres).");
        nome = scanner.nextLine();
        while(nome.length()<=3){
            System.out.println("Nome inválido! Digite novamente:");
            nome = scanner.nextLine();
        }
        System.out.println("Nome cadastrado!");

        System.out.println("Informe sua idade (de 0 a 150 anos).");
        idade = scanner.nextInt();
        while((idade < 0) || (idade > 150)){
            System.out.println("Idade invalida! Digite novamente:");
            idade = scanner.nextInt();
        }
        System.out.println("Idade cadastrada!");

        System.out.println("Informe seu salário:");
        salario = scanner.nextDouble();
        while(salario <= 0){
            System.out.println("Salário invalido. Digite novamente!");
            salario = scanner.nextDouble();
        }
        System.out.println("Salario cadastrado!");

        System.out.println("Qual seu sexo?\nm - masculino\nf - feminino.");
        sexo = scanner.nextLine();
        while((!sexo.equals("f") && (!sexo.equals("m")))){
            System.out.println("Informação inválida! Digite novamente:");
            sexo = scanner.nextLine();
        }
        System.out.println("Sexo cadastrado!");

        System.out.println("Qual seu estado civil?\ns - Solteiro(a).\nc - Casado(a).\nv - Viuvo(a).\nd - Divorciado(a).");
        estadoCivil = scanner.nextLine();
        while((!estadoCivil.equals("s")) && (!estadoCivil.equals("c")) && (!estadoCivil.equals("v")) && (!estadoCivil.equals("d"))){
            System.out.println("Informação inválida! Digite novamente:");
            estadoCivil = scanner.nextLine();
        }
        System.out.println("Estado civil cadastrado!");
        
        scanner.close();
    }
}
