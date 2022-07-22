public class Diretor extends Funcionario implements Autenticacao {
    //Composição
private Autenticavel autenticavel;

    public Diretor(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.autenticavel = new Autenticavel(senha);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 1.5;
    }

    @Override
    public boolean autentica(String senha) {
       return this.autenticavel.autentica(senha);
    }
}
