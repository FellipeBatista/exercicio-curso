package com.mycompany.curso;

public class CursoEAD extends Curso{
    public CursoEAD(String nome,int cargaHoraria){
        super(nome,cargaHoraria);
    }
    
    @Override
    public double calcularValor(){
        if(this.getCargaHoraria() <= 200){
            return 250.00;
        } else {
            return 500.00;
        }
    }
}
