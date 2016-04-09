package exLuqueBravoAntonio;

/**
 * Examen Marzo 2013 Instrucciones del examen. Marzo de 2013 Clase HomoSapiens.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class HomoSapiens extends Mamifero {
	/**
	 * Piernas de HomoSapiens.
	 */
	private int piernas = 2;
	/**
	 * Brazos de HomoSapiens.
	 */
	private int brazos = 2;

	/**
	 * Constructor para HomoSapiens.
	 * 
	 * @param nombre
	 *            Nombre del HomoSapiens.
	 */
	HomoSapiens(String nombre) {
		super(nombre);
	}

	@Override
	protected String comer() {
		crecer();
		if (isEtapaAdulta()) {
			return "Estoy comiendo de todo";
		} else {
			return "Estoy mamando";
		}
	}

	@Override
	protected String desplazar() {
		if (isEtapaAdulta()) {
			return "Corriendo";
		} else
			return "Gateando";
	}

	@Override
	public String toString() {
		return "HomoSapiens [piernas=" + piernas + ", brazos=" + brazos + "toString()=" + super.toString() + "]";
	}

}
