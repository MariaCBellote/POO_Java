/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.futebol_time;

/**
 *
 * @author Usuario
 */
public class Treinador extends Membro implements Gerencia{
    private Time t;
    public Treinador(String nome, String CPF){
        super(nome,CPF);
    }
    
    @Override
     public void jogar(){
       System.out.println("Aposentado.");
    }
     
    @Override
    public void OrganizarTime(){
         System.out.println("Organizando time...");
    }
    
    @Override
    public void Treinar(){
         System.out.println("Treinando jogadores...");
    }

    public Time getT() {
        return t;
    }

    public void setT(Time t) {
        this.t = t;
    }
    
    
}
