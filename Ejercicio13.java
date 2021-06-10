/* 
   13. Realice un menú que permita ejecutar operaciones básicas matemáticas de dos números. Este menú debe repetirse hasta que el 
   usuario seleccione la opción de salir. Las operaciones a considerarse son:
        a. Sumar dos números
		b. Dividir dos números (no se puede dividir por cero)
		c. Salir
*/

import java.util.*;

public class Ejercicio13 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int opc;
		double num1, num2, resultado;

		do {

			System.out.println("\nOPERACIONES:");
			System.out.println(  "  1. Suma");
			System.out.println(  "  2. Division");
			System.out.println(  "  3. Salir");
			System.out.print(    "Elija una opcion: ");
			opc = read.nextInt();

			if (opc<3 && opc>0) {
				System.out.print("\nIngrese el primer numero: ");
				num1 = read.nextInt();
				System.out.print("Ingrese el segundo numero: ");
				num2 = read.nextInt();

				if (opc==1) {
					resultado = num1+num2;
					System.out.println("\n   El resultado de la suma es: "+resultado+"\n");
				}

				if (opc==2) {
					if (num2==0) {
						System.out.println("\n   No se puede dividir entre 0\n");

					} else {
						resultado = num1/num2;
						System.out.println("\n   El resultado de la division es: "+resultado+"\n");
					}
				}
			}

		} while (opc!=3);

		System.out.println();
	}


}

