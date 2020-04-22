package funcionario;

import funcionario.FuncionarioComissionado;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {

    private double salarioBase;

    public FuncionarioComissionadoBaseSalario(String primeiroNome, String ultimoNome, String cpf,double taxaDeComissao, double vendasBrutas, double salarioBase){
        super(primeiroNome, ultimoNome, cpf, taxaDeComissao, vendasBrutas);
        this.salarioBase = salarioBase;
    }

    public double getRendimentos() {
        return super.getRendimentos() + salarioBase;
    }

    public String toString() {
        return super.toString() + "\n Rendimentos: " + this.getRendimentos();
    }
}
