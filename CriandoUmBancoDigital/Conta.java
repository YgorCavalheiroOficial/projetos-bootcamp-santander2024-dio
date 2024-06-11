import java.util.Scanner;

import static java.lang.String.format;

public abstract class Conta implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL_DE_CONTA = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected int contaDestino;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL_DE_CONTA++;
    }
    public void sacar(double valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar: ");
        valor = scanner.nextDouble();

        if(saldo < valor){
            System.out.println("Saldo insuficiente!");
        }else{
            System.out.println("Saque realizado com sucesso!");
        }
        this.saldo = saldo - valor;
        System.out.println("Saldo atual: " + saldo);
    }

    public void depositar(double valor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja depositar: ");
        valor = scanner.nextDouble();
        this.saldo = valor + saldo;
    }

    public void transferir(double valor) {
        System.out.println("Digite a conta para qual quer transferir: ");
        Scanner scanner = new Scanner(System.in);
        contaDestino = scanner.nextInt();
        System.out.println("Digite o valor que deseja transferir: ");
        valor = scanner.nextInt();
        if(valor > saldo){
            System.out.println("Saldo insuficiente!");
        }else{
            depositar(valor);
            System.out.println("Transferencia concluida!");
        }
        this.sacar(valor);
    }
    protected void imprecaoDeExtrato() {
        System.out.println(format("Agencia: %d", this.agencia));
        System.out.println(format("Numero: %d", this.numero));
        System.out.println(format("Saldo: %.2f", this.saldo));
    }

}
