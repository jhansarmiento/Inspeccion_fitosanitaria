package inspeccion_fitosanitaria;
import interaccion.MenuConsola;

/**
 * Clase especializada en la interacción con el usuario en cuanto a la funcionalidad del software.
 * @version 1.20240314
 * @author Ricardo Vicente Jaime Vivas - Programa de Ingeniería de Sistemas - Universidad de Investigación y Desarrollo UDI - Grupo de Investigación en Ingeniería de Sistemas GIDSAW
 */

public class Menu extends MenuConsola {
	
	/**
	 * Método constructor de la clase. Aquí se debe configurar el sistema de menús y submenús, utilizando los métodos heredados de MenuConsola.
	 */
	
	public Menu() {
		this.rotuloPrimerNivel = "Inspección Fitosanitaria - Prototipo 01";
		this.rotuloSegundoNivel = "Inspección fitosanitaria de lugares de producción de vegetales para exportación en fresco";
		this.rotuloTercerNivel = "";
		this.agregarOpcion("Registrar Departamento", 1);
		this.agregarOpcion("Consultar Departamento", 2);
	}
}
