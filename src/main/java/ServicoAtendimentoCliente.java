public class ServicoAtendimentoCliente {
    private static ServicoAtendimentoCliente instance = new ServicoAtendimentoCliente();

    private ServicoAtendimentoCliente() { }

    public static ServicoAtendimentoCliente getInstance() {
        return instance;
    }

    public String receberElogioEmpresa(String mensagem) {
        return "O SAC agradece o contato. A empresa respondeu sua demanda conforme a mensagem " +
                "a seguir: " + Empresa.getInstance().receberElogio(mensagem);
    }

    public String receberReclamacaoEmpresa(String mensagem) {
        return "O SAC agradece o contato. A empresa respondeu sua demanda conforme a mensagem " +
                "a seguir: " + Empresa.getInstance().receberReclamacao(mensagem);
    }

    public String receberSugestaoEmpresa(String mensagem) {
        return "O SAC agradece o contato. A empresa respondeu sua demanda conforme a mensagem " +
                "a seguir: " + Empresa.getInstance().receberSugestao(mensagem);
    }
}
