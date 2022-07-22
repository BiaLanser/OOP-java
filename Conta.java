public class Conta {
    public double saldo = 0;
    public int agencia;
    public int conta;
    public Titular titular;
    
    // Métodos
    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if(this.sacar(valor)) {
            this.saldo -= 5;
            contaDestino.depositar(valor);
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        conta1.saldo = 10000;
        conta1.agencia = 85411;
        conta1.conta = 75489327;
        
        Titular titular1 = new Titular("Bia", "8989898989", "11111111111", "1111111");
        System.out.println(titular1.getNome());
        System.out.println(titular1.getCpf());
        System.out.println(titular1.getRg());


        conta1.titular = titular1;
        conta1.depositar(1000);

        System.out.println(conta1.saldo);
        System.out.println(conta1.agencia);
        System.out.println(conta1.conta);

        Conta conta2 = new Conta();
        conta2.saldo = 847;
        conta2.agencia = 8854776;
        conta2.conta = 75487777;
        
        Titular titular2 = new Titular("Alex", "909090909", "22222222222", "2222222");
        System.out.println(titular2.getNome());
        System.out.println(titular2.getCpf());
        System.out.println(titular2.getRg());


        conta2.titular = titular2;

        System.out.println(conta2.saldo);
        System.out.println(conta2.agencia);
        System.out.println(conta2.conta);

        conta1.depositar(1000);
        System.out.println(conta1.saldo);

        if (conta1.sacar(5000)){
            System.out.println("saque bem sucedido");
        }
        else {
            System.out.println("Falha ao sacar");
        }

        System.out.println("saldo: " + conta1.saldo);

        if (conta1.transferir(1000, conta2)) {
            System.out.println("Transferêncua bem-sucedida");
        }
        else {
            System.out.println("Saldo insufeciente");
        }

        System.out.println("Titular da conta 1: " + conta1.titular.getNome());
        System.out.println("Saldo da conta 1: " + conta1.saldo);
        System.out.println("Titular da conta 2: " + conta2.titular.getNome());
        System.out.println("Saldo da conta 2: " + conta2.saldo);

    }
}
