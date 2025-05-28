/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exbiblioteca;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nome;
    private int id;
    private Livro pegouLivro;
    private int count;
    private int maxEmp=5;
    private static int user=0;

    public Usuario(String nome, int id, int lista) {
        this.nome = nome;
        this.id = id;
        numeroUsers();
    }

    public static int getUser() {
        return user;
    }

    public static void setUser(int user) {
        Usuario.user = user;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome= " + nome + ", id= " + id + "numero de usuarios: " + user+'}';
    }
    
    public void pegarLivro(Livro pegouLivro){
        if(pegouLivro.isDisponivel() && this.count<=this.maxEmp )
        {
           pegouLivro.emprestar();
           this.pegouLivro=pegouLivro;
           this.count++;
        }
        else if(this.count>this.maxEmp)
        {
            System.out.println("Voce ultrapassou o maximo de livros ");
        }
        else{
            System.out.println("Livro indisponível");
        }
    }
    public void devolver(){
       if(this.count==0 ){
          System.out.println("vc n tem mais livros para devolver"); 
       }
       else{
        
    }
    }
    private static void numeroUsers(){
        user++;
    }
}
