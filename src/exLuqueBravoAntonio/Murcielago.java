package exLuqueBravoAntonio;

/**
 * Examen Marzo 2013 Instrucciones del examen. Marzo de 2013 Clase
 * Murci&eacute;lago.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class Murcielago extends Mamifero {
	/**
	 * Alas del mur&eacute;lago.
	 */
	private int alas = 2;
	/**
	 * Patas del mur&eacute;lago.
	 */
	private int patas = 2;

	/**
	 * Constructor de mur&eacute;lago.
	 * 
	 * @param nombre
	 *            Nombre del mur&eacute;lago.
	 */
	Murcielago(String nombre) {
		super(nombre);
	}

	@Override
	protected String comer() {
		crecer();
		if (isEtapaAdulta()) {
			return "Estoy comiendo insectos";
		} else {
			return "Estoy mamando";
		}

	}

	@Override
	protected String desplazar() {
		return "Volando";
	}

	@Override
	public String toString() {
		return "Murcielago [alas=" + alas + ", patas=" + patas + "toString()=" + super.toString() + "]";
	}

}
