/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exbiblioteca;

/**
 *
 * @author Usuario
 */
public class Livro {
    private String titulo, autor;
    private int anoPubicacao;
    private boolean disponivel;
    
    public Livro(String titulo, String autor, int ano)
    {
        this.titulo=titulo;
        this.autor=autor;
        this.anoPubicacao= ano;
        this.disponivel=true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPubicacao() {
        return anoPubicacao;
    }

    public void setAnoPubicacao(int anoPubicacao) {
        this.anoPubicacao = anoPubicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void emprestar(){
        if(this.disponivel==false)
        {
            System.out.println("Esse livro não está disponível.");
        }
        else{
            setDisponivel(false);
            System.out.println("Você pegou seu livro: "+getTitulo());
            System.out.println("Autor  do livro: "+getAutor());
        }
    }
    public void devolver() 
    {
      setDisponivel(true);
       System.out.println("Você devolveu o livro: "+getTitulo());
       System.out.println("Autor  do livro: "+getAutor());
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo= " + titulo + ", autor= " + autor + ", anoPubicacao= " + anoPubicacao + ", disponibilidade= " + disponivel + '}';
    }
    
    
    
}

