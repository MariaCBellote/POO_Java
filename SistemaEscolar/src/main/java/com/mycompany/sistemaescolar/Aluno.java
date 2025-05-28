/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaescolar;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Aluno {
    private String nome,matricula;
    private double nota1,nota2,notaFinal;
    private static int totalAlunos;
    
    //metodos especiais

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        totalAlunos++;
        this.gerarMatricula();
        this.exibirBoletim();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    
    //metodos normais
    private void calcularMedia()
    {
        notaFinal=(getNota1()+getNota2())/2;
        if(notaFinal>=7)
        {
            System.out.println("Você foi aprovado, " + nome +".");         
        }
        else if(notaFinal<7 && notaFinal>=3)
        {
            System.out.println("Você está de recuperação, " + nome +"."); 
        }
        else{
              System.err.println("Você foi reprovado, " + nome +"."); 
        }
    }
    private static int n=0;
    private void gerarMatricula(){
      int ano ; 
      Random rand=new Random();
      ano=Year.now().getValue();
      //n=rand.nextInt(10000);
      n=n+1;
      matricula= String.format("%d%04d", ano,n);
    }
    
   public void exibirBoletim()
   {
      System.out.println("-------------------------------------"); 
      System.out.println("Nome: "+getNome());
       System.out.println("Matrícula: "+ matricula);
      System.out.println("Nota do primeiro bimestre: "+getNota1()); 
      System.out.println("Nota do segundo bimestre: "+getNota2()); 
       calcularMedia();
      System.out.printf("Notafinal: %.2f\n",notaFinal); 
      System.out.println("Total alunos: "+totalAlunos);
      System.out.println("-------------------------------------");
   }
   
   public static Aluno pedirInfo(){
      Scanner scan= new Scanner(System.in);
       System.out.println("Digite seu nome: ");
       String nome= scan.nextLine();
       System.out.println("Informe nota1: ");
       double nota1= scan.nextDouble();
       System.out.println("Informe nota2: ");
       double nota2= scan.nextDouble();
       return new Aluno(nome,nota1,nota2);
   }

    @Override
    public String toString() {
        return "Aluno: " +  nome + ", matricula: " + matricula;
    }
   
}
