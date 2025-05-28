/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expizza;

/**
 *
 * @author Usuario
 */
public class Pedido {
    private Cliente cliente;
    private Pizza pizza;
    private int numero;
    private static int c=0;

    public Pedido(Cliente cliente, Pizza pizza) {
        this.cliente = cliente;
        this.pizza = pizza;
        c++;
        this.numero=c;
    }

    public void exibirPedido() {
        System.out.println("📦 Pedido #" + numero);
        System.out.println(cliente);
        System.out.println(pizza);
        System.out.println("Total a pagar: R$" + pizza.getPreco());
        System.out.println("----------------------------");
    }
    
}
