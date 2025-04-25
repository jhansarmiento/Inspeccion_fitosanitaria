package inspeccion_fitosanitaria;
import interaccion.PresentacionConsola;

/**
 * Clase especializada en la interacción con el usuario en cuanto a los datos del problema.
 * @version 1.20240314
 * @author Ricardo Vicente Jaime Vivas - Programa de Ingeniería de Sistemas - Universidad de Investigación y Desarrollo UDI - Grupo de Investigación en Ingeniería de Sistemas GIDSAW
 */

public class Presentacion extends PresentacionConsola {
	
	/**
	 * Método constructor de la clase. Inicializa los atributos rotuloPrimerNivel y 
	 * rotuloSegundoNivel con el nombre y el propósito del software respectivamente.
	 */
	public Presentacion() {
		this.rotuloPrimerNivel = "Inspección Fitosanitaria - Prototipo 01";
		this.rotuloSegundoNivel = "Inspección fitosanitaria de lugares de producción de vegetales para exportación en fresco";
	}
	
	/**
	 * Método que solicita al usuario valores para los atributos de un nuevo Municipio. 
	 * Entrega como respuesta un objeto de la clase Departamento.
	 */
	
	public Departamento capturarDepartamento() {
		this.rotuloTercerNivel = "Captura de datos";
		Departamento rDepartamento;
		rDepartamento = new Departamento();
		this.vaciarContenido();
		rDepartamento.setCodigoDane(this.desplegarCapturaString("Código DANE: ", true));
		rDepartamento.setNombre(this.desplegarCapturaString("Nombre: ", true));
		return rDepartamento;
	}
	
	/**
	 * Método que presenta al usuario los valores de los atributos y los resultados de los métodos 
	 * de un objeto de la clase Departamento dado como parámetro.
	 * @pDepartamento : Parámetro con el objeto de la clase Departamento a ser presentado al usuario.
	 */
	
	public void presentarDepartamento(Departamento pDepartamento) {
		this.rotuloTercerNivel = "Presentación de datos";
		this.vaciarContenido();
		this.agregarContenido("Código DANE: " + pDepartamento.getCodigoDane());
		this.agregarContenido("Nombre: " + pDepartamento.getNombre());
		this.desplegarPresentacion();
	}
}
