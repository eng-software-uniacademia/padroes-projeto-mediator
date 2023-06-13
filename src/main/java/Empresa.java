public class Empresa implements Setor {
    private static final Empresa instance = new Empresa();

    private Empresa() { }
    public static Empresa getInstance() {
        return instance;
    }

    public String receberReclamacao(String mensagem) {
        return "A empresa vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A empresa agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A empresa vai analisar a sugestão: " + mensagem;
    }
}
