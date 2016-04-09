package exLuqueBravoAntonio;

/**
 * Examen Marzo 2013 Instrucciones del examen. Marzo de 2013 Clase Foca.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class Foca extends Mamifero {
	/**
	 * Extremidades de la Foca.
	 */
	private int extremidades = 4;

	/**
	 * Constructor de Foca.
	 * 
	 * @param nombre
	 *            Nombre de la foca.
	 */
	Foca(String nombre) {
		super(nombre);
	}

	@Override
	protected String comer() {
		crecer();
		if (isEtapaAdulta()) {
			return "Estoy comiendo peces, crustáceos y cefalópodos";
		} else {
			return "Estoy mamando";
		}
	}

	@Override
	protected String desplazar() {
		if (isEtapaAdulta()) {
			return "Nadando";
		} else
			return "Reptando";

	}

	@Override
	public String toString() {
		return "Foca [extremidades=" + extremidades + "toString()=" + super.toString() + "]";
	}

}
