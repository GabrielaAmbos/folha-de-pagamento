package funcionario;

import funcionario.Funcionario;

public class FuncionarioHonorista extends Funcionario {
    private double salarioPorHora;

    public double salario(int horasTrabalhas) {
        if(horasTrabalhas < 40) {
            return (horasTrabalhas * salarioPorHora);
        } else {
            return 40 * (salarioPorHora + ((horasTrabalhas - 40) * salarioPorHora * 1.5));
        }
    }

}
