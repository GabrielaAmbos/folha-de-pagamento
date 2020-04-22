package funcionario;

public class FuncionarioComissionado extends Funcionario {
    private double taxaDeComissao;
    private double vendasBrutas;

    public FuncionarioComissionado(String primeiroNome, String ultimoNome, String cpf, double taxaDeComissao, double vendasBrutas){
        super(primeiroNome, ultimoNome, cpf);
        this.vendasBrutas = vendasBrutas;
        this.taxaDeComissao = taxaDeComissao;
    }

    public double getRendimentos () {
        return taxaDeComissao * vendasBrutas;
    }

    public String toString() {
        return super.toString() + "\n Rendimentos: " + this.getRendimentos();
    }

}
