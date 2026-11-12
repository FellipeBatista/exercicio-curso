package com.mycompany.curso;
import java.util.ArrayList;

public class CursoPresencial extends Curso{
    public CursoPresencial(String nome,int cargaHoraria){
        super(nome,cargaHoraria);
    }
    
    @Override
    public double calcularValor(){
        if(this.getCargaHoraria() <= 350){
            return 1000.00;
        } else{
            return 2000.00;
        }
    }
    public static void main(String[] args){
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(new CursoPresencial("Medicina",500));
        cursos.add(new CursoEAD("ADS",400));
        cursos.add(new CursoEAD("Marketing Digital",200));
        cursos.add(new CursoPresencial("Engenharia de Software",600));
        cursos.add(new CursoPresencial("Gastronomia",350));
        
        for(Curso c: cursos){
            System.out.println("Nome do Curso: " + c.getNome() + ",Carga Horária: " + c.getCargaHoraria() + ",Valor: R$" + c.calcularValor());
        }
        System.out.println("Quantidade total de cursos registrados: " + Curso.cursosRegistrados());
    }
}
