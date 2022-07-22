//Herança: desenvolvedor é um funcioanario
public class Desenvolvedor extends Funcionario {
    private String linguagem;
    
    public Desenvolvedor(String nome, String cpf, double salario, String linguagem) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() * 1.15;
    }
}
