package com.maycon.springbeans;

public class Autor implements AutorLivro {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exbirAutor() {
        System.out.println(this.nome);
    }

    @Override
    public void exibirAutor() {
        // TODO Auto-generated method stub
        
    }
    
    
}
