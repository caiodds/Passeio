# Passeio
Passeio.java
package com.company;

public class Passeio {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Caio";
        pessoa.cachorro = new Cachorro1();
        pessoa.cachorro.nomes = "Puppy";
        andar(pessoa);

    }
    private static void andar(Pessoa pessoa){
        System.out.println("Pessoa que ta passeando é "+pessoa.nome);
        System.out.println("O Nome do cachorro que está com ele é "+pessoa.cachorro.nomes);
    }
}
