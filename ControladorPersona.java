package t9_ejercicios;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class ControladorPersona {

	public static int grabarMenu() {

		Scanner in = new Scanner(System.in);
		System.out.println("Elige una opción ");
		System.out.println("----------------------------------------------");
		System.out.println("1. Añadir persona ");
		System.out.println("----------------------");
		System.out.println("2. Eliminar persona ");
		System.out.println("----------------------");
		System.out.println("3. Modificar datos ");
		System.out.println("----------------------");
		System.out.println("4. ver datos ");
		System.out.println("--------- -------------");
		System.out.println("5. Mas Objetos ");
		System.out.println("--------- -------------");
		System.out.println("6. Matrizde10 ");
		System.out.println("--------- -------------");
		System.out.println("7. Salir ");
		System.out.println(" ");
		System.out.println("----------------------");

		int value = in.nextInt();
		System.out.println();
		return value;
	}

	public static Persona darAlta() throws ParseException {
		Persona persona = new Persona();
		persona.LeerDatosPersona();

		return persona;
	}

	public static void grabarPersonas(Persona[] MatrizPersona, int nPersonas) {
		// Mostrar array con datos
		for (int i = 0; i < nPersonas; i++) {
			MatrizPersona[i].VerDatosPersona();
		}
	}

	public static int buscaDni(String dniBuscado, Persona[] MatrizPersona, int nPersonas) {
		int posicion = -1;
		for (int i = 0; i < nPersonas; i++) {
			if (dniBuscado.equalsIgnoreCase(MatrizPersona[i].getDni())) {
				posicion = i;
			}
		}
		return posicion;
	}

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		Persona[] MatrizPersonas = new Persona[10];
		int nPersonas = 0;
		int valor = 0;

		while (valor != 6) {
			valor = grabarMenu();
			switch (valor) {
			case 1:

				if (nPersonas <= 10) {

					MatrizPersonas[nPersonas++] = darAlta();
				} else {
					System.out.println("¡La lista esta completa!");
				}
				break;
			case 2:
				if (nPersonas > 0) {
					MatrizPersonas[--nPersonas] = null;
					System.out.println("Se ha eliminado la ultima persona de la lista");
				} else {
					System.out.println("¡La lista esta vacia!");
				}
				break;
			case 3:
				if (nPersonas > 0) {
					System.out.println("Introduce el dni de la persna a la que quieres modificar los datos: ");
					String buscaDni = input.next();
					int posicion = buscaDni(buscaDni, MatrizPersonas, nPersonas);

					if (posicion == -1) {
						System.out.println("¡Persona no encontrada!");
					} else {
						MatrizPersonas[posicion].LeerDatosPersona();
						MatrizPersonas[posicion].VerDatosPersona();
					}

				} else {
					System.out.println("¡La lista esta vacia!");
				}
				break;
			case 4:

				if (nPersonas > 0) {
					grabarPersonas(MatrizPersonas, nPersonas);
				} else {
					System.out.println("¡La lista esta vacia!");
				}
				break;
			case 5:
				Persona persona1 = new Persona("adri", "benitez");
				Persona persona2 = new Persona("pepito", "grillo", "v");
				Persona persona3 = new Persona("44245678N", "pepito", "grillo", "v", LocalDate.now(), 56, 67);
				persona1.VerDatosPersona();
				persona2.VerDatosPersona();
				persona3.VerDatosPersona();
				break;
			case 6:
				for (int i = 0; i < 10; i++) {
					MatrizPersonas[i] = darAlta();

				}
				for (int i = 0; i < 10; i++) {
					MatrizPersonas[i].VerDatosPersona();

				}

				break;
			case 7:
				valor = 7;
				System.out.println("Cierre de aplicacion");
				break;
			default:
				System.out.println("¡Opcion no encontrada!");
			}
		}
	}
}
