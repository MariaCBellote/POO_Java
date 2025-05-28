/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaescolar;

/**
 *
 * @author Usuario
 */
public class Turma {
    private String nomeTurma;
    private Aluno aluno;
    private Professor professor;
    private int prof;

    public Turma(String nomeTurma, Aluno aluno, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.aluno = aluno;
        this.professor = professor;
        this.prof++;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getProf() {
        return prof;
    }

    public void setProf(int prof) {
        this.prof = prof;
    }
    
    
    public void trocarProfessor(Professor novoProf){
        this.professor=novoProf;
        this.prof++;
    }

    @Override
    public String toString() {
        return "Turma: " + nomeTurma+"\n" 
                 + getAluno() + "\n"+ prof+"\n"+ getProfessor()+"\n";
    }

  
}
