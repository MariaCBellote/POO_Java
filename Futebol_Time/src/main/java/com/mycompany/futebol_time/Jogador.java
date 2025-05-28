/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.futebol_time;

/**
 *
 * @author Usuario
 */
public class Jogador extends Membro {
    private Time time;
    public Jogador(String nome, String CPF){
        super(nome,CPF);
    }
    
    @Override
    public void jogar(){
       System.out.println("Jogando...");
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
}
