package com.generationjava.evaluacionjava.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Profesor extends Materia {
    /************************* Atributos *************************/
    //Se le asigna un nombre a cada profesor, la cantidad de cursos que tiene y la materia que imparte.
    public String nombreProfesor;
    public Integer cantCursos;

    /************************* Constructor por defecto *************************/

    public Profesor() {
        super();
    }
    
    /************************* Constructor Objeto Completo *************************/   
   
    public Profesor(String nombreCurso, Integer cantAlumnos, Integer nivel, String nomMateria, String nombreProfesor,
            Integer cantCursos) {
        super(nombreCurso, cantAlumnos, nivel, nomMateria);
        this.nombreProfesor = nombreProfesor;
        this.cantCursos = cantCursos;
    }
    
    
    /************************* Getter and Setter *************************/

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public Integer getCantCursos() {
        return cantCursos;
    }

    public void setCantCursos(Integer cantCursos) {
        this.cantCursos = cantCursos;
    }
    
    

    /************************* Métodos *************************/

    //funcion que añade el nombre del alumno y sus notas respectivas al HashMap "calificacionesRamo"
    public void aniadirAlumnos(int alumnos, int cantidadNotas, HashMap <String, ArrayList<Double>> calificacionesRamo){
        for(int i = 1; i<= alumnos; i++){
            Scanner interAlumnos = new Scanner(System.in);
            ArrayList<Double> notasporAlumno = new ArrayList<Double>();
            System.out.println("Ingrese nombre del alumno: ");
            String nombre = interAlumnos.nextLine();
            for(int j = 1; j<= cantidadNotas; j++){
                System.out.println("Ingrese nota " +j+ " del alumno " +nombre+ ": ");
                Double nota = interAlumnos.nextDouble();
                notasporAlumno.add(nota);
    
            }
            
            calificacionesRamo.put(nombre,notasporAlumno);
        
        }
    
    }

    /************************* toString *************************/
    @Override
    public String toString() {
        return super.toString() + "Profesor [nombreProfesor=" + nombreProfesor + ", cantCursos=" + cantCursos + "]";
    }


    

}
