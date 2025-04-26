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
	 * Método que solicita al usuario valores para los atributos de un nuevo Departamento. 
	 * Entrega como respuesta un objeto de la clase Departamento.
	 */
	
	public Departamento capturarDepartamento() {
		this.rotuloTercerNivel = "Captura De Datos Del Departamento";
		Departamento rDepartamento;
		rDepartamento = new Departamento();
		this.vaciarContenido();
		rDepartamento.setCodigoDane(this.desplegarCapturaString("Código DANE del departamento: ", true));
		rDepartamento.setNombre(this.desplegarCapturaString("Nombre del departamento: ", true));
		return rDepartamento;
	}
	
	/**
	 * Método que solicita al usuario el código DANE de un departamento para iniciar una consulta.
	 */
	public String capturarCodigoDaneDepartamento() {
		String rCodigoDane;
		this.rotuloTercerNivel = "Consulta de departamento";
		this.vaciarContenido();
		rCodigoDane = this.desplegarCapturaString("Código DANE del departamento: ", false);
		return rCodigoDane;
	}
	
	/**
	 * Método que solicita al usuario valores para los atributos de un nuevo Municipio. 
	 * Entrega como respuesta un objeto de la clase Municipio.
	 */
	
	public Municipio capturarMunicipio() {
		this.rotuloTercerNivel = "Captura De Datos Del Municipio";
		Municipio rMunicipio;
		rMunicipio = new Municipio();
		this.vaciarContenido();
		rMunicipio.setCodigoDane(this.desplegarCapturaString("Código DANE del municipio: ", true));
		rMunicipio.setNombre(this.desplegarCapturaString("Nombre del municipio: ", true));
		return rMunicipio;
	}
	
	/**
	 * Método que solicita al usuario valores para los atributos de una nueva vereda. 
	 * Entrega como respuesta un objeto de la clase Vereda.
	 */
	
	public Vereda capturarVereda() {
		this.rotuloTercerNivel = "Captura De Datos De La Vereda";
		Vereda rVereda;
		rVereda = new Vereda();
		this.vaciarContenido();
		rVereda.setCodigoDane(this.desplegarCapturaString("Código DANE de la vereda: ", true));
		rVereda.setNombre(this.desplegarCapturaString("Nombre de la vereda: ", true));
		return rVereda;
	}
	
	/**
	 * Método que solicita al usuario valores para los atributos de un nuevo Propietario. 
	 * Entrega como respuesta un objeto de la clase Propietario.
	 */
	
	public Propietario capturaPropietario() {
		this.rotuloTercerNivel = "Captura De Datos Propietario";
		Propietario rPropietario;
		rPropietario = new Propietario();
		this.vaciarContenido();
		rPropietario.setId(this.desplegarCapturaString("Id del propietario: ", true));
		rPropietario.setNombreCompleto(this.desplegarCapturaString("Nombre o razón social del propietario: ", true));
		rPropietario.setCedula(this.desplegarCapturaString("Cédula o NIT del propietario: ", true));
		rPropietario.setTelefono(this.desplegarCapturaString("Número de contacto del propietario: ", true));
		rPropietario.setCorreo(this.desplegarCapturaString("Correo electrónico del propietario: ", true));
		return rPropietario;
	}
	
	/**
	 * Método que presenta al usuario los valores de los atributos y los resultados de los métodos 
	 * de un objeto de la clase Departamento dado como parámetro.
	 * @pDepartamento : Parámetro con el objeto de la clase Departamento a ser presentado al usuario.
	 */
	
	public void presentarDepartamento(Departamento pDepartamento) {
		this.rotuloTercerNivel = "Presentación De Datos Del Departamento";
		this.vaciarContenido();
		this.agregarContenido("Código DANE del departamento: " + pDepartamento.getCodigoDane());
		this.agregarContenido("Nombre del departamento: " + pDepartamento.getNombre());
		this.desplegarPresentacion();
	}
	
	public void presentarMunicipio(Municipio pMunicipio) {
		this.rotuloTercerNivel = "Presentación De Datos Del Municipio";
		this.vaciarContenido();
		this.agregarContenido("Código DANE del municipio: " + pMunicipio.getCodigoDane());
		this.agregarContenido("Nombre del municipio: " + pMunicipio.getNombre());
		this.desplegarPresentacion();
	}
	
	public void presentarVereda(Vereda pVereda) {
		this.rotuloTercerNivel = "Presentación De Datos De La Vereda";
		this.vaciarContenido();
		this.agregarContenido("Código DANE de la vereda: " + pVereda.getCodigoDane());
		this.agregarContenido("Nombre de la vereda: " + pVereda.getNombre());
		this.desplegarPresentacion();
	}
	
	public void presentarPropietario(Propietario pPropietario) {
		this.rotuloTercerNivel = "Presentación De Datos Del Propietario";
		this.vaciarContenido();
		this.agregarContenido("Id del propietario: " + pPropietario.getId());
		this.agregarContenido("Nombre o razón social del propietario: " + pPropietario.getNombre());
		this.agregarContenido("Cédula o NIT del propietario: " + pPropietario.getCedula());
		this.agregarContenido("Número de contacto del propietario: " + pPropietario.getTelefono());
		this.agregarContenido("Correo electrónico del propietario: " + pPropietario.getCorreo());
		this.desplegarPresentacion();
	}
	
}
