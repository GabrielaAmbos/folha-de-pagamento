public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {

    private double salarioBase;

    @Override
    public double getRendimentos() {
        return getRendimentos() + salarioBase;
    }
}
