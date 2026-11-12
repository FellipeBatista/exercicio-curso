package com.mycompany.curso;

public abstract class Curso {
    private String nome;
    private int cargaHoraria;
    private static int totalCursos;
    public Curso(String nome,int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        totalCursos++;
    }
    
    public abstract double calcularValor();
    public String getNome(){
        return this.nome;
    }
    public int getCargaHoraria(){
        return this.cargaHoraria;
    }
    public static int cursosRegistrados(){
        return totalCursos;
    }
}
