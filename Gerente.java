package HierarquiaDeFuncionariosInterfaceDeBonificação;

public class Gerente extends Funcionario implements Bonificavel{
    private double bonusFixo;
    public Gerente(String nome, double salario, double bonusFixo){
            super(nome,salario);
            this.bonusFixo=bonusFixo;
    }

    @Override
    public double CalcularBonus(){
        return getSalario() * 0.40 + bonusFixo;
    }
    @Override
    public double aplicarBonus(){
        double novoSalario=getSalario() + CalcularBonus();
        System.out.print("Salario novo: "+novoSalario);
        return novoSalario;
    }
}
