package com.maycon.springbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    private String nome;
    private String codigo;

    @Autowired // injetar dependência
    AutorLivro autorLivro;
    
    public AutorLivro getAutorLivro() {
        return autorLivro;
    }
    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }
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
        autorLivro.exibirAutor();
    }
    
    

}
