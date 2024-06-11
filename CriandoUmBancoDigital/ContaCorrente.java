public class ContaCorrente extends Conta {
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente === ");
        super.imprecaoDeExtrato();
    }
}
