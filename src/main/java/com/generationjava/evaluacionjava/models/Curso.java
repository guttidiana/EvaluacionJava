package com.generationjava.evaluacionjava.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    /************************* Atributos *************************/
    //nombre del curso ejemplo: 4A
    //nivel ejemplo 4
    public String nombreCurso;
    public Integer cantAlumnos;
    public Integer nivel;

    /************************* Constructor por defecto *************************/

    public Curso() {
        super();
    }

    
    /************************* Cosntructor Objeto Completo *************************/

    public Curso(String nombreCurso, Integer cantAlumnos, Integer nivel) {
        this.nombreCurso = nombreCurso;
        this.cantAlumnos = cantAlumnos;
        this.nivel = nivel;
    }
   

    /************************* Getter and Setter *************************/

    public String getNombreCurso() {
        return nombreCurso;
    }


    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }


    public Integer getCantAlumnos() {
        return cantAlumnos;
    }


    public void setCantAlumnos(Integer cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }


    public Integer getNivel() {
        return nivel;
    }


    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    

    /************************* Métodos *************************/
    //función que añade los nombres de los alumnos que el profesor desee, y se imprimen por pantalla.
    public void alumnosDelCurso(int num){
        Scanner inter = new Scanner(System.in);
        ArrayList<String> alumnos = new ArrayList<String>();
        for(int i = 1; i<= num; i++){
            System.out.println("Ingrese el nombre del alumno "+i);
            String nombre = inter.nextLine();
            alumnos.add(nombre);
        }
        inter.close();
        System.out.println("La lista de los alumnos ingresados: " +alumnos);

    }

    /************************* toString *************************/

    @Override
    public String toString() {
        return "Curso [nombreCurso=" + nombreCurso + ", cantAlumnos=" + cantAlumnos + ", nivel=" + nivel + "]";
    }




   

}
