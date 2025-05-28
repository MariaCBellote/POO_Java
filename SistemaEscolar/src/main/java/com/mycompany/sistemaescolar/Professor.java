/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaescolar;

import java.util.Scanner;

public class Professor {
    private String nome,disciplina;
    private static int qp=0;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
        qp++;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void exibirProfessor()
   {
        System.out.println("Nome: "+ getNome());
        System.out.println("Leciona: "+getDisciplina());
         System.out.println("Quantidade de professores: "+qp);
   }
   
   public static Professor perguntarInfo(){
       Scanner scan=new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome=scan.nextLine();
        System.out.println("Informe sua disciplina: ");
        String disciplina= scan.nextLine();
        return new Professor(nome,disciplina);
   }

    @Override
    public String toString() {
        return "Professor: "  + nome + ", disciplina: " + disciplina;
    }
   
}
