package com.maycon.springbeans;

public class Livro {

    private String nome;
    private String codigo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método pra exibir livro.
    public void exibir() {
        System.out.println(this.nome + " - " + this.codigo);
    }
    
    

}
