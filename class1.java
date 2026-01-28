package ContextualizandoMente;

public class class1 {
    private String nome;
    private int idade;
    //getters e setters
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    public int getIdade(){return idade;}
    public void setIdade(){this.idade=idade;}
    //construtor
    public class1(String nome, int idade){this.nome=nome;this.idade=idade;}
    public void falar(){System.out.println("oi");}
}
