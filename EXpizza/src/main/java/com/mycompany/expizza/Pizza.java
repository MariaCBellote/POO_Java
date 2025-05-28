/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expizza;

/**
 *
 * @author Usuario
 */
public class Pizza {
    private String sabor;
    private float preco;
   private String tamanho;

    public Pizza(String sabor, String tamanho) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        setPreco();
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco() {
        switch(tamanho.toLowerCase())
        {
            case "pequena":
                preco=20.50f;
                break;
            case "media":
                preco=30.25f;
                break;
            case "grande":
                preco=40.00f;
                break;
            default:
                System.out.println("Escolha um tamanho: pequeno, medio ou grande!");
                break;
        }
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Pizza de " + "sabor= " + sabor + ", preco= " + preco + ", tamanho= " + tamanho +".";
    }
    
    
}
