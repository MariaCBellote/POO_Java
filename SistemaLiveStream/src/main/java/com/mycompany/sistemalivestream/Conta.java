/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemalivestream;

/**
 *
 * @author Usuario
 */
public abstract class Conta {
   
  protected String nome;
  protected String email;
  protected String senha;

    public Conta(String nome, String email,String senha) {
        this.nome = nome;
        this.email = email;
        this.senha=senha;
    }

    public abstract void getTipoConta();
    
     public void trocarSenha(String s){
        if(!s.equals(this.senha)){
            this.senha=s;
            System.out.println (this.senha);
        }
        else{
         System.out.println ("Essa senha já está sendo utilizada: "+ senha);
        }
    }
     
      public void exibirPerfil(){
        System.out.println( "Nome: "+nome+"|"+ "Email "+email);
    }  
      
      public String editarPerfil(String nome, String email)
    {
        this.nome=nome;
        this.email=email;
        return "Nome e email atualizados para: "+ nome+"|"+email;
    }
    
}
   
