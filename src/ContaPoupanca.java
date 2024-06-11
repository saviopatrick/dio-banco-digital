public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero, String titular) {
        super(numero, titular);
    }

    public void renderJuros(double taxa) {
        if (taxa > 0) {
            double juros = getSaldo() * taxa;
            depositar(juros);
        }
    }
}
