package funcionario;

public class FuncionarioAssalariado extends Funcionario {

    private double salarioSemanal;

    public FuncionarioAssalariado(String primeiroNome, String ultimoNome, String cpf, double salarioSemanal){
        super(primeiroNome, ultimoNome, cpf);
        this.salarioSemanal = salarioSemanal;
    }

    public double getRendimentos(){
        return this.salarioSemanal;
    }

}
