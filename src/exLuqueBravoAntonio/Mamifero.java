package exLuqueBravoAntonio;

/**
 * Examen Marzo 2013 Instrucciones del examen. Marzo de 2013 Clase
 * Mam&iacute;fero.
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public abstract class Mamifero {
	/**
	 * Nombre del mam&iacute;fero.
	 */
	private String nombre;
	/**
	 * Bandera que indica si el mam&iacute;fero esta en la etapa adulta(true) o
	 * no(false).
	 */
	private boolean etapaAdulta = false;
	/**
	 * Contador de amamantado.
	 */
	private int amamantado = 1;

	/**
	 * Constructor para mam&iacute;fero.
	 * 
	 * @param nombre
	 *            Nombre del mam&iacute;fero.
	 */
	Mamifero(String nombre) {
		setNombre(nombre);
	}

	protected String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected boolean isEtapaAdulta() {
		return etapaAdulta;
	}

	private void setEtapaAdulta(boolean etapaAdulta) {
		this.etapaAdulta = etapaAdulta;
	}

	/**
	 * M&eacute;todo para dar de comer al mam&iacute;fero.
	 * 
	 * @return cadena.
	 */
	protected abstract String comer();

	/**
	 * M&eacute;todo para desplazar al mam&iacute;fero.
	 * 
	 * @return cadena.
	 */
	protected abstract String desplazar();

	/**
	 * Hace crecer al mam&iacute;fero.
	 */
	protected void crecer() {
		if (amamantado == 3) {
			setEtapaAdulta(true);
		}
		amamantado++;
	}

	@Override
	public String toString() {
		return "Mamifero [Etapa=" + comprobarAdulto() + ", nombre=" + nombre + ", amamantado=" + amamantado
				+ "alimentar()=" + comer() + ",desplazar()=" + desplazar() + "]";
	}

	/**
	 * Comprueba si el mam&iacute;fero esta en su fase adulta.
	 * 
	 * @return cadena.
	 */
	private String comprobarAdulto() {
		if (isEtapaAdulta()) {
			return "Adulta";
		}
		return "Cría";
	}

}
