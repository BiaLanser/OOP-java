public class Conta {
    // Atributos
    public double saldo;
    public int agencia;
    public int conta;
    public Titular titular;

    // Métodos
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        }

        this.saldo -= valor;
        return true;

    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (this.sacar(valor)) {
            this.saldo -= 5;
            contaDestino.depositar(valor);
            return true;
        }

        return false;
    }
}

