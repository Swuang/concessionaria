public class Carros extends Veiculo {

    private Integer motorizacao_cv;
    private Integer qtde_marcha;
    private String opicionais;
    
    public Integer getMotorizacao_cv() {
        return motorizacao_cv;
    }
    
    public void setMotorizacao_cv(Integer motorizacao_cv) {
        this.motorizacao_cv = motorizacao_cv;
    }

    public Integer getQtde_marcha() {
        return qtde_marcha;
    }

    public void setQtde_marcha(Integer qtde_marcha) {
        this.qtde_marcha = qtde_marcha;
    }

    public String getOpicionais() {
        return opicionais;
    }

    public void setOpicionais(String opicionais) {
        this.opicionais = opicionais;
    }

     @Override
    public void salvar() {
        System.out.println("Carro salva com sucesso!");
        super.salvar();
    }

    @Override
    public void alterar() {
        System.out.println("Carro alterada com sucesso!");
        super.alterar();
    }

    @Override
    public void excluir() {
        System.out.println("Carro excluída com sucesso!");
        super.excluir();
    }

    @Override
    public void pesquisar() {
        System.out.println("Carro pesquisada com sucesso!");
        super.pesquisar();
    }
}
