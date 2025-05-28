/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.futebol_time;

/**
 *
 * @author Usuario
 */
public abstract class Membro {
    private String nome, CPF;
    
    public Membro(String nome, String CPF){
        this.nome=nome;
        this.CPF=CPF;
    }
    
    public void validarCPF(String CPF){
        if(this.CPF.equals(CPF)){
            System.out.println("CPF: "+ CPF+ " válido");
        }
        else{
             System.out.println("CPF inválido");
        }
    }
    
    public abstract void jogar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
}
