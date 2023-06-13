public abstract class Pessoa {
    public String elogiarEmpresa(String mensagem) {
        return ServicoAtendimentoCliente.getInstance().receberElogioEmpresa(mensagem);
    }

    public String reclamarEmpresa(String mensagem) {
        return ServicoAtendimentoCliente.getInstance().receberReclamacaoEmpresa(mensagem);
    }

    public String sugerirEmpresa(String mensagem) {
        return ServicoAtendimentoCliente.getInstance().receberSugestaoEmpresa(mensagem);
    }
}
