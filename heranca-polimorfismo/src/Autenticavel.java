public class Autenticavel {
    private String senha;

    public Autenticavel(String senha) {
        this.senha = senha;
    }

    public boolean autentica(String senha) {
        return this.senha == senha;
    }
}
