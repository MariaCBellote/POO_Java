/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.futebol_time;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Time {
    private List<Jogador> jogadores=new ArrayList<>();
    private Treinador t;
    
    public void addJogador(String nome, String CPF){
        Jogador j=new Jogador(nome,CPF);
        if(!jogadores.contains(j)){
            jogadores.add(j);
            j.setTime(this);
        }
    }
    
    public void estabelecerTecnico(Treinador t){
    this.t=t;
    t.setT(this);
    System.out.println("Técnico: "+t.getNome());
    
}  
    public void listarJogadores(){
         System.out.println("Jogadores:");
         for(Jogador j: jogadores){
         System.out.println(j.getNome());    
    }
}
}
