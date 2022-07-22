public class Titular {
    private String nome;
    private String telefone;
    private String cpf;
    private String rg;

    public Titular(String nome, String telefone, String cpf, String rg) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}


