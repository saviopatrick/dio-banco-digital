public abstract class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}

