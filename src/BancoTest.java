public class BancoTest {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345", "João", 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("54321", "Maria");

        contaCorrente.depositar(1000.0);
        contaPoupanca.depositar(2000.0);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

        contaCorrente.sacar(200.0);
        contaPoupanca.sacar(500.0);

        System.out.println("Saldo Conta Corrente após saque: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança após saque: " + contaPoupanca.getSaldo());

        contaCorrente.transferir(100.0, contaPoupanca);

        System.out.println("Saldo Conta Corrente após transferência: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança após transferência: " + contaPoupanca.getSaldo());

        contaCorrente.sacar(1500.0);
        System.out.println("Saldo Conta Corrente após usar cheque especial: " + contaCorrente.getSaldo());

        contaPoupanca.renderJuros(0.01);
        System.out.println("Saldo Conta Poupança após rendimento de juros: " + contaPoupanca.getSaldo());
    }
}
