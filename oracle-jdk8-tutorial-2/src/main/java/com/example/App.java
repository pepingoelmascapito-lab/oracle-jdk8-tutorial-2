package com.example;

import java.math.BigDecimal;




public class App {
	public static void main(String[] args) {

		// El array es un identificador que hace referencia a una zona de memoria,
		// a diferencia de una variable que hace referencia a una sola ubicacion
		// en la memoria, y que puede contener elementos de un mismo tipo de datos
		// A los elementos del array se pueden acceder utilizando un indice numerico,
		// entero, entre corchetes

		/*
		 * como se declara un array actualmente?
		 */

		// por ejemplo, un array de String
		// el identificador nombre es un array donde cada elemento del array es de tipo
		// String

		// ¿Que ventajas no ofrece?
		// Que en lugar de crear una variable por cada elemento ahora solo tenemos
		// un nombre para todo el conjunto de los elementos y es mucho mas escalable
		// porque podremos tratar 10, 20 o un millon de elementos de la misma forma

		// Si no existieran los array, entonces

		String nombre1;
		String nombre2;
		;
		;
		String nombren; // n significa un numero cualquiera, es decir, n puede ser 10, 20 o un millon,
						// pero no es una variable, es solo una forma de representar que hay muchos
						// elementos

		String[] nombres = { "pepe", "miguel", "angel", "Aña", "chinchulin" };
		
		System.out.println("array original de nombres "); 
		System.out.println(nombres[0]);
		System.out.println(nombres[1]);
		System.out.println(nombres[2]);
		System.out.println(nombres[3]);
		
		System.out.println("el array de nombres tiene " + nombres.length + " elementos");
		// Tamaño fijo implica que no se pueden agregar mas elementos al array, 
		// pero si se pueden modificar los elementos existentes
		// nombres[3] = "Marisol";

		nombres[2] = "jijijija";

		System.out.println("Array de nombres modificado");

		System.out.println(nombres[2]);

		int[] arraynumeros = {

				1, 2, 3, 4, 5, };

		// declara un array de 3 manzanas

		/*
		 * Manzana[] manzanas = { new Manzana("roja", "dulce", "golden", 10, 0.5, new
		 * java.math.BigDecimal("0.99")), new Manzana("verde", "ácida", "granny smith",
		 * 12, 0.6, new java.math.BigDecimal("1.29")), new Manzana("amarilla", "dulce",
		 * "golden delicious", 11, 0.55, new java.math.BigDecimal("1.19")) };
		 */

		Manzana[] manzanas = {
				Manzana.builder()
				.color("Roja")
				.sabor("Dulce")
				.variedad("Red Delicious")
				.size(7.5)
				.peso(0.2)
				.precio(new BigDecimal("0.50"))
				.build(),
				Manzana.builder()
				.color("Verde")
				.sabor("Acida")
				.variedad("Granny Smith")
				.size(6.0)
				.peso(0.25)
				.precio(new BigDecimal("0.60"))
				.build(),
				Manzana.builder()
				.color("Amarilla")
				.sabor("Dulce")
				.variedad("Golden Delicious")
				.size(8.0)
				.peso(0.3)
				.precio(new BigDecimal("0.55"))
				.build()

				};
		
		
		// Hasta el momento los arrays que hemos creado son de tamaño
		// fijo, es decir, no se pueden modificar una vez que han sido creados
		
		/* Declarar arrays que sean modificables, es decir, que se le puedan
		* agregar o eliminar elementos o modificar los elementos existentes */
		
		
		String [] nombres2 = new String[5]; 
		
		// El array de nombres2 tiene 3 elementos, pero todos los elementos son null
		// porque no se les ha asignado un valor aun. Con la sentencia anterior 
		// se ha reservado espacio en la memoria para 3 elementos de tipo String.
		// No sera posible pasarse de la cantidad de elementos reservados para el array
		// que en el caso anterior es de 3.
		
		nombres2[0] = "hola";
		nombres2[1] = "como";
		nombres2[2] = "estan";
	}

}