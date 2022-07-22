public class Gerente extends Funcionario {

    private Autenticavel autenticavel;
    
    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.autenticavel = new Autenticavel(senha);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 1.25;
    }

    // Utilizand método específico 
    public void dizOi() {
        System.out.println("Oi do gerente!");
    }
}
