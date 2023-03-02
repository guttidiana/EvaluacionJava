package com.generationjava.evaluacionjava;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generationjava.evaluacionjava.models.Curso;
import com.generationjava.evaluacionjava.models.Profesor;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.HashMap;


@SpringBootApplication
public class EvaluacionjavaApplication {

/************************* Bajada del enunciado *************************/
//Entrada

	/*
	 *datos profesor
	 *notas por estudiante
	 *nombres de los alumnos

	 */

//Procesamiento

	/*
	 *Ingresar notas por estudiante.
	 *Obtener el promedio de cada estudiante.
	 
	 *Guardar un arreglo de una cierta cantidad de alumnos por curso
	 *Luego mostrar el arreglo.
	 
	 *Ingresar notas
	 *calcular mejor y peor nota
	 *calcular el promedio
	 */


//Salida

	/*
	 *Promedio de cada estudiante.
	 *Arreglo con nombres de los estudiantes
	 *Mejor nota, peor nota, promedio de notas. 
	 */

/**********************************************************************************/
/***************************************** Procedimiento inicial y Métodos *****************************************/

//1. Se crea la clase Curso la que será clase abuelo, ya que cada materia tiene los mismos atributos que clase,
// Y Materia será clase padre, ya que la clase profesor tiene los mismos atributos que materia.
//2. Se importa Scanner, HashMap y ArrayList.


//Función para calcular el promedio de notas.
//Se le ingresa un arrayList con las notas y retorna un Double como promedio.
public static Double promedioNotas(ArrayList<Double> notas){
	Double suma = 0.0;
	for(int i = 0; i < notas.size(); i++){
		suma += notas.get(i);
	}
	return suma/notas.size();
}


//funcion para agregar notas y mostrar la mejor nota, peor nota y promedio de notas.
//Se inicia y se cierra un Scanner "inter", se crea un arrayList "todas" la que tendrá todas las notas ingresadas.
//Se inicia el primer for para añadir las notas.
//El segundo for contiene dos do.. while, en el que el primero se busca la nota más alta y en el segundo se busca la nota más baja.
//Le designo a "peor" el primer valor del array para tener un valor a comparar.
//Se calcula el promedio de las notas.
//Se imprime la mejor nota, peor nota y promedio de las notas.
public static void mejorPeoryPromedio(int cuantas){
	Scanner inter = new Scanner(System.in);
	ArrayList<Double> todas = new ArrayList<Double>();
	for(int i = 1; i<=cuantas; i++){
		System.out.println("Ingrese la nota " +i);
		Double nota = inter.nextDouble();
		todas.add(nota);

	}
	
	Double mejor = 0.0;
	Double peor = todas.get(0);
	for(int i = 0; i< todas.size(); i++){
		do{
			if(mejor < todas.get(i)){
				mejor = todas.get(i);
			}
		}while(mejor < todas.get(i));

		do{
			if(peor > todas.get(i)){
				peor = todas.get(i);
			}
		}while(peor > todas.get(i));
	}
	Double suma = 0.0;
	for(int i = 0; i < todas.size(); i++){
		suma += todas.get(i);
	}
	suma = suma/todas.size();
	System.out.println("la mejor nota es " +mejor);
	System.out.println("La peor nota es " + peor);
	System.out.println("El promedio de las notas es " +suma);
}

	public static void main(String[] args) {
		//Se inicia teclado, se crea un HashMap donde se guardarán los nombres de los alumnos y sus respectivas notas.
		//Se crea Profesor y Clase vacíos.
		Scanner teclado = new Scanner(System.in);
		HashMap <String, ArrayList<Double>> calificacionesRamo = new HashMap<String, ArrayList<Double>>();
		Profesor profeDefault = new Profesor();
		Curso cursoDefault = new Curso();
		
		//Se piden los datos del profesor
		System.out.println("Bienvenido/a profesor/a :3");
		
		System.out.println("Por favor ingrese su nombre: ");
		String name = teclado.nextLine();
		profeDefault.setNombreProfesor(name);
		
		System.out.println("Ingrese la cantidad de cursos que tiene: ");
		int cursoProfesor = teclado.nextInt();
		profeDefault.setCantCursos(cursoProfesor);
		
		//Esta opción no la deja interactuar en consola, estamos trabajando para usted :p
		System.out.println("Ingrese la materia que imparte: ");
		String nomRamo = teclado.nextLine();
		profeDefault.setNomMateria(nomRamo);
		
		System.out.println("Se han agregado sus datos exitosamente, estimade :)");

		/***************************************** Inicia el Menú *****************************************/
		int opcion = 0;
		int opciondos = 0;
		//Quise que do..while funcionara de forma que después de cada opción, permita volver al menú, pero no funcionó :p
		do{
			System.out.println("************** Menú Principal ***************");
			System.out.println("Ingrese 1 si quiere ingresar alumnos con sus notas y ver el promedio de estas.");
			System.out.println("Ingrese 2 si quiere guardar a algunos alumnos.");
			System.out.println("Ingrese 3 para ingrasar notas y ver la mejor nota, peor nota y promedio de notas.");
			System.out.println("Ingrese 0 para salir del menú.");
			System.out.print("Ingrese su opción: ");
			opcion = teclado.nextInt();
			
			if(opcion == 1){

				//Esta opción no la deja interactuar en consola, estamos trabajando para usted :p
				System.out.println("Ingrese el nombre de la materia: ");
				String nombredos = teclado.nextLine();
				cursoDefault.setNombreCurso(nombredos);
				profeDefault.setNombreCurso(nombredos);

				System.out.println("Ingrese la cantidad de alumnos del curso ingresado: ");
				int cantidad = teclado.nextInt();
				profeDefault.setCantAlumnos(cantidad);

				System.out.println("Ingrese la cantidad de notas por alumno: ");
				int cantNotas = teclado.nextInt();
				int alumnos = profeDefault.getCantAlumnos();
				//Se llama al método "aniadirAlumnos" que está en clase Profesor
				profeDefault.aniadirAlumnos(alumnos, cantNotas, calificacionesRamo);

				//Se calcula el promedio llave por llave.
				for(String i : calificacionesRamo.keySet()){
					Double promedio = promedioNotas(calificacionesRamo.get(i));
					System.out.println("El promedio del alumno " +i+ " es de: " +promedio);
				}
				System.out.println("¿Desea volver al menú?(1 para volver, 0 para salir)");
				opciondos = teclado.nextInt();
			
			}else if(opcion == 2){
				//Se llama al método alumnosDelCurso que está en clase Curso
				System.out.println("Ingrese cuántos alumnos desea ingresar: ");
				int numero = teclado.nextInt();
				cursoDefault.alumnosDelCurso(numero);
			
				System.out.println("¿Desea volver al menú?(1 para volver, 0 para salir)");
				opciondos = teclado.nextInt();
			
			}else if(opcion == 3){
				//Se llama al método declarado en public class de esta página
				System.out.println("Ingrese cuántas notas desea agregar: ");
				int cuantas = teclado.nextInt();
				mejorPeoryPromedio(cuantas);
			
				System.out.println("¿Desea volver al menú?(1 para volver, 0 para salir)");
				opciondos = teclado.nextInt();

			}else if(opcion == 0){
				System.out.println("Que tenga buen día :)");
			
			}else{
				System.out.println("Fatality :p");
			}
		}while(opciondos == 1);
	
	}
}
/***************************************** comentarios *****************************************/
/*
 * Quise orientar el ejercicio a que se pudieran añadir los profesores, mencionar sus materias, y poder seleccionar por curso, ejemplo 4A, y así poder ir guardando las cosas de forma mucho más ordenada, por eso las opciones de añadir cursos y nombre de materia, pero me compliqué mucho así que lo limité para poder contestar bien a las peticiones del enunciado. 
 * Muchas gracias por leer!.
 */
	
