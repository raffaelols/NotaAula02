public class ContaCorrente extends Conta {
    private double chequeEspecial = 1000.00;

    public ContaCorrente(String titular) {
        super(titular);
    }

    public void usarChequeEspecial(double valor) {
        if (valor <= chequeEspecial) {
            saldo += valor;
            chequeEspecial -= valor;
            System.out.println("Utilização do cheque especial: R$" + valor);
        } else {
            System.out.println("Limite do cheque especial insuficiente.");
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cheque especial disponível: R$" + chequeEspecial);
    }
}
