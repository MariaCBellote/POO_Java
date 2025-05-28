/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.futebol_time;

/**
 *
 * @author Usuario
 */
public class Futebol_Time {

    public static void main(String[] args) {
        Treinador t1=new Treinador("Junior","444.999.000.66");
        
        Time t=new Time();
        t.estabelecerTecnico(t1);
        
        t.addJogador("Neymar", "111.111.000.00");
        t.addJogador("Ronaldo", "444.111.000.00");
        t.addJogador("Marcos", "888.111.000.11");
        
        t.listarJogadores();
    }
}
