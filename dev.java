package HierarquiaDeFuncionariosInterfaceDeBonificação;

public class dev extends Funcionario implements Bonificavel{
    private double bonusFixo;
    public dev (String nome, double salario, double bonusFixo){
        super(nome,salario);
        this.bonusFixo=bonusFixo;
    }

    @Override
    public double CalcularBonus(){
        return getSalario() * 0.20 + bonusFixo;
    }
    @Override
    public double aplicarBonus(){
        double novoSalario=getSalario() + CalcularBonus();
        System.out.print("Salario novo: "+novoSalario);
        return novoSalario;
    }
}
