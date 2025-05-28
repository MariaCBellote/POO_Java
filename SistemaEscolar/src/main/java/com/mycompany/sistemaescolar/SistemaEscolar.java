/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaescolar;

/**
 *
 * @author Usuario
 */
public class SistemaEscolar {

    public static void main(String[] args) {
        Aluno a1=Aluno.pedirInfo();
        Aluno a2=Aluno.pedirInfo();
        
        Professor p1=Professor.perguntarInfo();
        p1.exibirProfessor();
        Professor p2=Professor.perguntarInfo();
        Professor p3=new Professor("julio","matematica");
        p3.exibirProfessor();
        Turma t1= new Turma("cc2",a1,p1);
        System.out.print(t1);
        t1.trocarProfessor(p2);
        System.out.print(t1);
       
        Turma t2= new Turma("cc3",a1,p1);
        System.out.print(t2);
         p2.exibirProfessor();
    }
}
