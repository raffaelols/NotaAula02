public class ContaPoupanca extends Conta {
    private static final double SELIC = 8.5; // Alterar conforme a taxa Selic real

    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void calcularRendimento() {
        double rendimento;
        if (SELIC > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * SELIC * saldo;
        }
        saldo += rendimento;
        System.out.println("Rendimento calculado: R$" + rendimento);
    }
}
