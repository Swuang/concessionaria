public class Main {
    public static void main(String[] args) throws Exception {
        
        Categoria categoria1 = new Categoria("SUV");
        Garagem garagem1 = new Garagem("Garagem do Zé", "São Paulo");
        Veiculo veiculo1 = new Veiculo("Fusca", 1980, 1980, "Azul", "ABC-1234", true, categoria1, garagem1);
        Carros carro1 = new Carros(100, 5,"Ar Condicionado, Direção Hidráulica");
        Motos moto1 = new Motos(150);

        
        carro1.salvar();
        moto1.salvar();
        veiculo1.salvar();
        categoria1.salvar();
        garagem1.salvar();

        carro1.alterar();
        carro1.pesquisar();
        carro1.excluir();
    }  

}
