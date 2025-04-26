package inspeccion_fitosanitaria;

import persistencia.RegistroCsv;
import persistencia.ArchivoCsv;

/**
 * Clase especializada en la persistencia de los datos del problema.
 * 
 * @version 1.20240314
 * @author Ricardo Vicente Jaime Vivas - Programa de Ingeniería de Sistemas -
 *         Universidad de Investigación y Desarrollo UDI - Grupo de
 *         Investigación en Ingeniería de Sistemas GIDSAW
 */

public class Datos extends ArchivoCsv {

	/**
	 * Nombre, sin extensión, del archivo para almacenar los registros de objetos de
	 * la clase Departamento.
	 */
	public String archivoDepartamentos;
	
	/**
	 * Nombre, sin extensión, del archivo para almacenar los registros de objetos de
	 * la clase municipio.
	 */
	public String archivoMunicipios;

	/**
	 * Método constructor de la clase. Inicializa el atributo archivoDepartamentos
	 * con un nombre apropiado.
	 */
	public Datos() {
		this.archivoDepartamentos = "Departamentos";
		this.archivoMunicipios = "Municipios";
	}

	/**
	 * Método que graba en el archivo correspondiente un registro con valores de los
	 * atributos del objeto de la clase Departamento dado como parámetro.
	 * 
	 * @pDepartamento : Parámetro con el objeto de la clase Departamento a ser grabado.
	 */

	public void grabarDepartamento(Departamento pDepartamento) {
		RegistroCsv tRegistro;
		tRegistro = new RegistroCsv();
		tRegistro.agregarValor(pDepartamento.getCodigoDane());
		tRegistro.agregarValor(pDepartamento.getNombre());
		this.grabarRegistro(this.archivoDepartamentos, tRegistro);
	}
	
	/**
	 * Método que graba en el archivo correspondiente un registro con valores de los
	 * atributos del objeto de la clase Municipio dado como parámetro.
	 * 
	 * @pMunicipio : Parámetro con el objeto de la clase Municipio a ser grabado.
	 */
	
	public void grabarMunicipio(Municipio pMunicipio) {
		RegistroCsv tRegistro;
		tRegistro = new RegistroCsv();
		tRegistro.agregarValor(pMunicipio.getCodigoDane());
		tRegistro.agregarValor(pMunicipio.getNombre());
		this.grabarRegistro(this.archivoMunicipios, tRegistro);
	}
	
	/**
	 * Método que construye un nuevo objeto de la clase Departamento con los valores de los atributos de su registro 
	 * almacenado en los archivos correspondientes, de donde los recupera utilizando un código DANE como parámetro de búsqueda.
	 */
	public Departamento recuperDepartamento(String pCodigoDane) {
		Departamento rDepartamento;
		RegistroCsv tRegistro;
		tRegistro = this.recuperarRegistro(this.archivoDepartamentos, pCodigoDane, 0);
		rDepartamento = new Departamento();
		rDepartamento.setCodigoDane(tRegistro.extraerString(0));
		rDepartamento.setNombre(tRegistro.extraerString(1));
		return rDepartamento;
	}
	
	/**
	 * Método que construye un nuevo objeto de la clase Municipio con los valores de los atributos de su registro 
	 * almacenado en los archivos correspondientes, de donde los recupera utilizando un código DANE como parámetro de búsqueda.
	 */
	public Municipio recuperMunicipio(String pCodigoDane) {
		Municipio rMunicipio;
		RegistroCsv tRegistro;
		tRegistro = this.recuperarRegistro(this.archivoDepartamentos, pCodigoDane, 0);
		rMunicipio = new Municipio();
		rMunicipio.setCodigoDane(tRegistro.extraerString(0));
		rMunicipio.setNombre(tRegistro.extraerString(1));
		return rMunicipio;
	}
}
