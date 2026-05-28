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
				Manzana.builder().color("Roja").sabor("Dulce").variedad("Red Delicious").size(7.5).peso(0.2)
						.precio(new BigDecimal("0.50")).build(),
				Manzana.builder().color("Verde").sabor("Acida").variedad("Granny Smith").size(6.0).peso(0.25)
						.precio(new BigDecimal("0.60")).build(),
				Manzana.builder().color("Amarilla").sabor("Dulce").variedad("Golden Delicious").size(8.0).peso(0.3)
						.precio(new BigDecimal("0.55")).build()

		};

		// Hasta el momento los arrays que hemos creado son de tamaño
		// fijo, es decir, no se pueden modificar una vez que han sido creados

		/*
		 * Declarar arrays que sean modificables, es decir, que se le puedan agregar o
		 * eliminar elementos o modificar los elementos existentes
		 */

		String[] nombres2 = new String[5];

		// El array de nombres2 tiene 3 elementos, pero todos los elementos son null
		// porque no se les ha asignado un valor aun. Con la sentencia anterior
		// se ha reservado espacio en la memoria para 3 elementos de tipo String.
		// No sera posible pasarse de la cantidad de elementos reservados para el array
		// que en el caso anterior es de 3.

		nombres2[0] = "hola";
		nombres2[1] = "como";
		nombres2[2] = "estan";

		// siuuu

		/*
		 * SENTENCIAS DE CONTROL DE FLUJO. En general permiten modificar el flujo de
		 * ejecucion de un programa en dependencia del cumplimiento de una o varias
		 * condiciones, aqui estarian las sentencia condicionales if - else y switch -
		 * case y switch - expression
		 * 
		 * Y por otra parte, pero como parte tambien de las sentencias de control flujo
		 * estarian las que permiten ejecutar en bucle un conjunto de sentencias entre
		 * las que estarian
		 * 
		 * 1- sentencia for clasica 2- sentencia for mejorada 3- sentencia while 4-
		 * sentencia do - while
		 * 
		 * Por ultimo las sentencias break y continue
		 */

		/*
		 * La sentencia for clasica, se utiliza cuando se conoce a priori la cantidad de
		 * veces que se van ejecutar un conjunto de instrucciones.
		 * 
		 * Tambien se puede utilizar para recorrer los elementos de un array
		 */

		/*
		 * Para mostrar en la consola los elementos de un array, por ejemplo el array de
		 * nombres
		 */

		System.out.println("Recorriendo el array" + " nombres con una sentencia for clasica");

		for (int o = 0; o < nombres.length; o++) {
			System.out.println(nombres[o]);

			/* Si intentaramos mostrar por la consola los elemetos del array nombres */

			System.out.println("Intentando imprimir los elementos del array nombres");
			System.out.println(nombres);
		}

		/*
		 * La sentencia anterior solamente mostro por la consola la direccion de memoria
		 * de la zona donde estan almacenados los elementos del array pero los elementos
		 * como tal no los ha mostrado.
		 * 
		 * Para mostrar los elementos del array se necesita una sentencia de control de
		 * flujo, que en bucle recorra todos los elementos del array de nombres y podria
		 * ser la sentencia for clasica, en primer lugar, y en segundo lugar la
		 * sentencia for mejorada
		 */

		// primero: sentencia "for" clasica

		System.out.println("recorriendo/iterando los elementos del array nombres con una sentencia for clasica");

		int totalNOmbres = nombres.length;

		// for (int i = 0; i <= totalNombres - 1; i++ ) {
		// System.out.println(nombres[i]);

		for (int i = 0; i <= nombres.length - 1; i++) {
			System.out.println(nombres[i]);

			System.out.println();

			/* OPERADOR DE AUTO INCREMENTO (++) Y DE AUTO DECREMENTO (--) */

			int ii = 0;

			++ii;

			ii++;
		}

		/*
		 * Para comprobar la diferencia entre las dos instrucciones anteriores se puede
		 * utilizar una herramiento de linea de comandos llamado jshell y comprobaremos
		 * que el operador de autoincremento cuando esta solo, es lo mismo que este al
		 * principio que al final, que no es igual a cuando esta en una expresion
		 */

		Math.random();

		/*
		 * Ejemplo de creacion de un array de numeros fraccionarios, tipo double, que
		 * tienen parte entera y parte fraccionaria. Los valores del array se tienen que
		 * generar de forma aleatoria y con numeros entre 0 100,
		 * 
		 * Sabemos que debemos de utilizar el metodo random() de la biblioteca Math,
		 * pero no sabemos como hacer que genere numeros aleatorios entre 0 y 100.
		 * 
		 * Por lo tanto vamos a utilizar la herramienta jshell para averiguar como hacer
		 * que se generen los numeros aleatorios que queremos
		 *//*
			 * Ejemplo de creacion de un array de numeros fraccionarios, tipo double, que
			 * tienen parte entera y parte fraccionaria. Los valores del array se tienen que
			 * generar de forma aleatoria y con numeros entre 0 100,
			 * 
			 * Sabemos que debemos de utilizar el metodo random() de la biblioteca Math,
			 * pero no sabemos como hacer que genere numeros aleatorios entre 0 y 100.
			 * 
			 * Por lo tanto vamos a utilizar la herramienta jshell para averiguar como hacer
			 * que se generen los numeros aleatorios que queremos
			 */

		System.out.println("Array de numeros de tipo double, generado de forma aleatoria ");

		double[] arrayDeDoubles = new double[20];

		System.out.println("Array original, con los valores por defecto ");

		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			System.out.println(arrayDeDoubles[i]);
		}

		// Rellenando el array con valores generados aleatoriamente
		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {
			arrayDeDoubles[i] = Math.random() * 100 - 1;
		}

		// Mostrando el array resultante

		for (int i = 0; i <= arrayDeDoubles.length - 1; i++) {

			System.out.println(arrayDeDoubles[i]);
		}

		/*
		 * Ejercicio # 1. Modificar el ejemplo anterior para que array sea de 100
		 * numeros enteros generados aleatoriamente
		 * 
		 * Sugerencia: Hacer un commit previamente a ponerse con la solucion del
		 * ejercicio, para que puedas modificar el codigo sin que se pierda el codigo
		 * del ejemplo original
		 */

		System.out.println("------- Solucion al Ejercicio # 1 -------");
		long[] numerosEnteros = new long[100];

		System.out.println("Array original de numeros enteros: ");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			System.out.println(numerosEnteros[i]);
		}

		System.out.println("Array resultante, generado aleatoriamente");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			numerosEnteros[i] = Math.round(Math.random() * 100 - 1);
		}

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {
			System.out.println(numerosEnteros[i]);
		}

		/*
		 * SENTENCIA FOR MEJORADA.
		 * 
		 * Se recomienda su uso siempre que no haya que trabajar con el indice o los
		 * indices de un array
		 */

		System.out.println("----- SENTENCIA FOR MEJORADA (Mal llamada forEach) ---------------");

		for (long numero : numerosEnteros) {
			System.out.println(numero);
		}

		/*
		 * Ejercicio # 2.
		 * 
		 * Recorrer el array numerosEnteros y solamente mostrar aquellos elementos que
		 * son de indice par
		 * 
		 * ¿Cuando un valor es par?
		 * 
		 * Cuando el resultado del residuo de la division por 2 es igual a cero.
		 * 
		 * El residuo de la division la da el operador %, o tambien mod en una
		 * calculadora
		 */

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {

			if (i % 2 != 0) {
				System.out.println("indice: " + i + ", numero: " + numerosEnteros[i]);
			}
		}

		/*
		 * Ejercicio 3, recorrer el array de numeros enteros y mostrar solamente los
		 * elementos impares
		 */
		System.out.println("----- Ejercicio 3 -----");

		for (long n : numerosEnteros) {

			if (n % 2 != 0) {
				System.out.println(n);
			}
		}
		/*
		 * Ejercicio 4, recorrer el array de numeros enteros y mostrar solamente los que
		 * sean de indice impar
		 */
		System.out.println("----- Ejercicio 4 -----");

		for (int i = 0; i <= numerosEnteros.length - 1; i++) {

			if (i % 2 != 0) {
				System.out.println("indice:" + i + ", numero " + numerosEnteros[i]);
			}
		}

		
		//ANTES DE ESTUDIAR LAS SENTENCIAS DE ASIGNACION COMPUESTAS
		
	}

}
