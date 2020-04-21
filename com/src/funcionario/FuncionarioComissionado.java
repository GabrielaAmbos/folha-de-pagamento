package funcionario;

public class FuncionarioComissionado extends Funcionario {
    private double taxaDeComissao;
    private double vendasBrutas;

    public double getRendimentos () {
        return taxaDeComissao * vendasBrutas;
    }

    public void setTaxaDeComissao(double taxaDeComissao){
        this.taxaDeComissao = taxaDeComissao;
    }

    public void setVendasBrutas(double vendasBrutas){
        this.vendasBrutas = vendasBrutas;
    }

}
