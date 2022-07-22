public class App {
    public static void main(String[] args) throws Exception {
        Titular titular1 = new Titular("Bia", "123456789", "45467890323", "6080545", "1233");
        System.out.println(titular1.getNome());

        Diretor diretor = new Diretor("Alex", "54678923490", 30000, "1234");
        Gerente gerente = new Gerente("João", "54678988967", 20000, "234");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alex", "54688923490", 12000, "java");

        System.out.println("Bonificação do diretor" + diretor.getBonificacao());
        System.out.println("Bonificação do gerente" + gerente.getBonificacao());
        System.out.println("Bonificação do desenvolvedor" + desenvolvedor.getBonificacao());

        gerente.dizOi();

        if (diretor.autentica("1234")){
            System.out.println("Diretor conseguiu logar no sistema");
        }
        else {
            System.out.println("Diretor não conseguiu logar no sistema");
        }
    
        if (titular1.autentica("1233")){
            System.out.println("Titular conseguiu logar no sistema");
        }
        else {
            System.out.println("Titular não conseguiu logar no sistema");
        }
    }
}
