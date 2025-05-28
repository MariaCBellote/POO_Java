/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expizza;

/**
 *
 * @author Usuario
 */
public class EXpizza {

    public static void main(String[] args) {
       Cliente c1= new Cliente("Joana", "999-0098");
       Cliente c2= new Cliente("Reginaldo", "999-0098");
        
       Pizza p1= new Pizza("Peperoni", "Grande") ;
       Pizza p2= new Pizza("Mussarela", "pequena") ;
       Pizza p3= new Pizza("Peperoni", "media") ;
       
       Pedido pe1= new Pedido(c1,p1);
       Pedido pe2= new Pedido(c1,p3);
       Pedido pe3= new Pedido(c2,p2);
       
       
       
       pe1.exibirPedido();
       pe2.exibirPedido();
       pe3.exibirPedido();
       
    }
}
