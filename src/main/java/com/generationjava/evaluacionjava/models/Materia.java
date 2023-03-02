package com.generationjava.evaluacionjava.models;

public class Materia extends Curso {
    /**************************** Atributos ****************************/ 
    public String nomMateria;

    /**************************** Constructor por defecto ****************************/ 
    public Materia(){
        super();
    }

    /**************************** Constructor Objeto Completo ****************************/ 
    public Materia(String nombreCurso, Integer cantAlumnos, Integer nivel, String nomMateria) {
        super(nombreCurso, cantAlumnos, nivel);
        this.nomMateria = nomMateria;
    }

    /**************************** Getter and Setter  ****************************/ 
    
    public String getNomMateria() {
        return nomMateria;
    }

    public void setNomMateria(String nomMateria) {
        this.nomMateria = nomMateria;
    }

    /**************************** Métodos ****************************/ 
    public void superior(){
        System.out.println("Soy la mejor materia del colegio ñ.ñ");
    }

    /**************************** toString  ****************************/ 
    @Override
    public String toString() {
        return super.toString() + "Materia [nomMateria=" + nomMateria + "]";
    }






}
