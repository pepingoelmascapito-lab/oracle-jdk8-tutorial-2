package com.example;

public class App {
	public static void main(String[] args) {

		/* Trabajo con arrays de dos dimensiones, 
		* tambien llamado matriz.
		* * Cuando el array es de una sola dimension se le denomina
		* vector. */
		
		
		/* ¿Como declarar un array de dos dimensiones (matriz) ? */
		
		
		/* A modo de ejemplo, vamos a crear un array bidimensional
		* de 3 filas y 3 columnas con numeros enteros.
		* * Posteriormente recorreremos dicha matriz para buscar la 
		* ocurrencia de un numero y cuando se encuentre imprimir
		* en la consola la fila y la columna donde ha sido encontrado
		* dicho numero */
		
		
		int[][] matrizEnteros = {

				{1, 2, 3, 10, 100, 200},
				{4, 5, 6, 20},
				{7, 8, 9 },
				{4, 5, 6, 20, 400},
				{7, 8, 9, 30}

				};
		
		// --- CORRECCIÓN QUIRÚRGICA: Declaramos la variable globalmente aquí ---
		int numeroABuscar = 5;
		// ----------------------------------------------------------------------

		int valor = matrizEnteros[1][0];
		System.out.println("El valor es: " + valor);
		
		// for (int fila = 0; fila <= 3 - 1; fila++ ) 
		// for (int columna = 0; columna <= 3 - 1; columna++ ) {
		// 
		// }

		
		int totalFilas = matrizEnteros.length;

		System.out.println("Total de filas: " + totalFilas);

		for (int fila = 0; fila <= totalFilas - 1; fila++) 
		for (int columna = 0; columna <= 
		matrizEnteros[fila].length - 1; columna++) {

			
			
			
			
		}
		
		System.out.println("-----Solucion al ejercicio # 1 del viernes 5 de Junio-----");
		
		for (int fila = 0; fila <= totalFilas - 1; fila++)
			for (int columna = 0; columna <= matrizEnteros[fila].length - 1; columna++) {
				if (matrizEnteros[fila][columna] == numeroABuscar) {
					System.out.println("El numero " + numeroABuscar + " se encuentra en la fila " + fila + " y en la columna " + columna);
				}
			}
		
		
		
		
		
		
}}