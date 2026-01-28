package ContextualizandoMente;

public class main {
    public static void main(String[] args){
        class2 person1 = new class2("gustavo",34,true);
        System.out.println("nome: "+person1.getNome());
        System.out.println("idade: "+person1.getIdade());
        System.out.println("face: "+person1.face);
        person1.falar();
    }
}
