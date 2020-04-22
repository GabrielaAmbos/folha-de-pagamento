package funcionario;

public class Funcionario {
    private String primeiroNome;
    private String ultimoNome;
    private String cpf;

    public Funcionario(String primeiroNome, String ultimoNome, String cpf) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome completo: " + this.primeiroNome + " " + this.ultimoNome + "\nCpf: " + this.cpf;
    }

}
