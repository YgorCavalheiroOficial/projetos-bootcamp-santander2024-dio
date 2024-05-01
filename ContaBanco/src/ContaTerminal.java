import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número de sua agência: ");
        String numeroAgencia = new String();
        numeroAgencia = scanner.nextLine();
        
        System.out.println("Por favor digite o número de sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor digite o seu nome: ");
        String nomeCliente = new String();
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

    System.out.println("Olá " + nomeCliente + 
    ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
    ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque. ");
    }
}
