package PolimorfismoModelo;

public class Main {
    public static void main(String[] args){
    Animal animal = new Animal();
    animal.emitirSom();
    Gato gato = new Gato();
    gato.emitirSom();
    Cachorro cachorro = new Cachorro();
    cachorro.emitirSom();
    }
}
