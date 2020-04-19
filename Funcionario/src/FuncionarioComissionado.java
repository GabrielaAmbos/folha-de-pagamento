public class FuncionarioComissionado extends Funcionario {
    private double taxaDeComissao;
    private double vendasBrutas;

    public double getRendimentos () {
        return taxaDeComissao * vendasBrutas;
    }

}
