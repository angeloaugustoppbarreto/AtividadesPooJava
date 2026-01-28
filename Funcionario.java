package HierarquiaDeFuncionariosInterfaceDeBonificação;
public abstract class Funcionario implements Bonificavel{
    private String nome;
    private double salario;
    //construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(){
        this.salario=salario;
    }

    public abstract double CalcularBonus();
}
