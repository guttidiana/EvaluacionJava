package com.generationjava.evaluacionjava.models;

public class Alumno {

    /**************************** Atributos ****************************/ 
    public Integer nomAlum;
    public String rut;
    public String nivel;

    /**************************** Constructor por defecto ****************************/ 
    public Alumno() {

    }

    /**************************** Constructor Objeto Completo ****************************/ 
    public Alumno(Integer nomAlum, String rut, String nivel) {
        this.nomAlum = nomAlum;
        this.rut = rut;
        this.nivel = nivel;
    }

    /**************************** Getter and Setter ****************************/ 
    public Integer getNomAlum() {
        return nomAlum;
    }

    public void setNomAlum(Integer nomAlum) {
        this.nomAlum = nomAlum;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**************************** Métodos ****************************/ 
    public void hacerlapata(){
        System.out.println("Profe súbame cinco décimas, le prometo que no me río más en clases *.*");
    }

    /**************************** toString ****************************/ 
    @Override
    public String toString() {
        return "Alumno [nomAlum=" + nomAlum + ", rut=" + rut + ", nivel=" + nivel + "]";
    }
    

   



}
