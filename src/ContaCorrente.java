public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double limiteChequeEspecial) {
        super(numero, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (getSaldo() + limiteChequeEspecial) >= valor) {
            double novoSaldo = getSaldo() - valor;
            if (novoSaldo < 0) {
                limiteChequeEspecial += novoSaldo;
                novoSaldo = 0;
            }
        }
    }
}
