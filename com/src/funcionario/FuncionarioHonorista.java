package funcionario;

import funcionario.Funcionario;

public class FuncionarioHonorista extends Funcionario {
    private double salarioPorHora;
    private int horasTrabalhadas;

    public FuncionarioHonorista(String primeiroNome, String ultimoNome, String cpf, double salarioPorHora, int horasTrabalhadas){
        super(primeiroNome, ultimoNome, cpf);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double salario() {
        if(horasTrabalhadas < 40) {
            return (horasTrabalhadas * salarioPorHora);
        } else {
            return 40 * (salarioPorHora + ((horasTrabalhadas - 40) * salarioPorHora * 1.5));
        }
    }

    public String toString(){
        return super.toString() + " \n Salario: " + this.salario();
    }

}
