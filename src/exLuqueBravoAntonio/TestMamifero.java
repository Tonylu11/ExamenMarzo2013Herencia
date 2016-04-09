package exLuqueBravoAntonio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import utiles.Menu;
import utiles.Teclado;

/**
 * Examen Marzo 2013 Instrucciones del examen. Marzo de 2013
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class TestMamifero {
	/**
	 * Men&uacute; general para el cat&aacute;logo.
	 */
	private static Menu menuGeneral = new Menu("Catálogo de mamíferos",
			new String[] { "Añadir mamífero", "Listar mamiferos", "Listar humanos", "Listar focas en orden inverso",
					"Contar muercielagos", "Alimentar a todos los mamiferos del catálogo", "Salir" });
	/**
	 * Men&uacute; para la elecci&oacute;n de mam&iacute;fero.
	 */
	private static Menu eleccionMamifero = new Menu("Elige un mamífero de la lista",
			new String[] { "Homo sapiens", "Murciélago", "Foca", "Salir" });
	/**
	 * ArrayList para el cat&aacute;logo de mam&iacute;feros.
	 */
	private static ArrayList<Mamifero> catalogo = new ArrayList<Mamifero>();

	public static void main(String[] args) {
		int opcion;
		do {
			opcion = menuGeneral.gestionar();
			switch (opcion) {
			case 1:
				annadirMamifero();
				break;
			case 2:
				listarMamiferos();
				break;
			case 3:
				listarHumanos();
				break;
			case 4:
				listarFocasInverso();
				break;
			case 5:
				contarMurcielagos();
				break;
			case 6:
				alimentarTodos();
				break;
			case 7:
				System.out.println("Adiosss..");
				break;
			}
		} while (opcion != 7);
	}

	/**
	 * Alimenta a todos los mam&iacute;feros.
	 */
	private static void alimentarTodos() {
		Iterator<Mamifero> it = catalogo.iterator();
		while (it.hasNext()) {
			Mamifero mamifero = it.next();
			mamifero.comer();
		}
	}

	/**
	 * Cuenta los murci&eacute;lagos del cat&aacute;logo.
	 */
	private static void contarMurcielagos() {
		Iterator<Mamifero> it = catalogo.iterator();
		int contador = 0;
		while (it.hasNext()) {
			Mamifero mamifero = it.next();
			if (mamifero instanceof Murcielago) {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " murciélagos en el catálogo.");
	}

	/**
	 * Lista las focas en orden inverso.
	 */
	private static void listarFocasInverso() {
		ListIterator<Mamifero> li = catalogo.listIterator(catalogo.size());
		while (li.hasPrevious()) {
			Mamifero mamifero = li.previous();
			if (mamifero instanceof Foca) {
				System.out.println(mamifero);
			}
		}
	}

	/**
	 * Lista solamente los HomoSapiens.
	 */
	private static void listarHumanos() {
		Iterator<Mamifero> it = catalogo.iterator();
		while (it.hasNext()) {
			Mamifero mamifero = it.next();
			if (mamifero instanceof HomoSapiens) {
				System.out.println(mamifero);
			}
		}

	}

	/**
	 * Lista todos lo mam&iacute;feros.
	 */
	private static void listarMamiferos() {
		Iterator<Mamifero> it = catalogo.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "\n");
		}
	}

	/**
	 * A&ntilde;ade un mam&iacute;fero en el cat&aacute;logo.
	 */
	private static void annadirMamifero() {
		int opcion;
		do {
			opcion = eleccionMamifero.gestionar();
			switch (opcion) {
			case 1:
				catalogo.add(new HomoSapiens(Teclado.leerCadena("Introduce el nombre")));
				break;
			case 2:
				catalogo.add(new Murcielago(Teclado.leerCadena("Introduce el nombre")));
				break;
			case 3:
				catalogo.add(new Foca(Teclado.leerCadena("Introduce el nombre")));
				break;
			case 4:
				break;
			}
		} while (opcion != 4);

	}
}
