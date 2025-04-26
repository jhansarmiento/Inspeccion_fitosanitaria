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
	 * Nombre, sin extensión, del archivo para almacenar los registros de objetos de
	 * la clase municipio.
	 */
	public String archivoVeredas;

	/**
	 * Método constructor de la clase. Inicializa el atributo archivoDepartamentos
	 * con un nombre apropiado.
	 */
	public Datos() {
		this.archivoDepartamentos = "Departamentos";
		this.archivoMunicipios = "Municipios";
		this.archivoVeredas = "Veredas";
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
	 * Método que construye un nuevo objeto de la clase Departamento con los valores de los atributos de su registro 
	 * almacenado en los archivos correspondientes, de donde los recupera utilizando un código DANE como parámetro de búsqueda.
	 */
	public Departamento recuperarDepartamento(String pCodigoDane) {
		Departamento rDepartamento;
		RegistroCsv tRegistro;
		tRegistro = this.recuperarRegistro(this.archivoDepartamentos, pCodigoDane, 0);
		rDepartamento = new Departamento();
		rDepartamento.setCodigoDane(tRegistro.extraerString(0));
		rDepartamento.setNombre(tRegistro.extraerString(1));
		return rDepartamento;
	}
	
	/**
	 * Método que reemplaza en el archivo correspondiente un registro con valores de los atributos 
	 * del objeto de la clase Departamento dado como parámetro.
	 * @pDepartamento : Parámetro con el objeto de la clase Departamento a ser grabado.
	 */
	public void actualizarDepartamento(Departamento pDepartamento) {
		RegistroCsv tRegistro;
		tRegistro = new RegistroCsv();
		tRegistro.agregarValor(pDepartamento.getCodigoDane());
		tRegistro.agregarValor(pDepartamento.getNombre());
		this.actualizarRegistro(this.archivoDepartamentos, tRegistro, 0);
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
	 * Método que construye un nuevo objeto de la clase Municipio con los valores de los atributos de su registro 
	 * almacenado en los archivos correspondientes, de donde los recupera utilizando un código DANE como parámetro de búsqueda.
	 */
	public Municipio recuperarMunicipio(String pCodigoDane) {
		Municipio rMunicipio;
		RegistroCsv tRegistro;
		tRegistro = this.recuperarRegistro(this.archivoMunicipios, pCodigoDane, 0);
		rMunicipio = new Municipio();
		rMunicipio.setCodigoDane(tRegistro.extraerString(0));
		rMunicipio.setNombre(tRegistro.extraerString(1));
		return rMunicipio;
	}
	
	/**
	 * Método que reemplaza en el archivo correspondiente un registro con valores de los atributos 
	 * del objeto de la clase Municipio dado como parámetro.
	 * @pMunicipio : Parámetro con el objeto de la clase Departamento a ser grabado.
	 */
	public void actualizarMunicipio(Municipio pMunicipio) {
		RegistroCsv tRegistro;
		tRegistro = new RegistroCsv();
		tRegistro.agregarValor(pMunicipio.getCodigoDane());
		tRegistro.agregarValor(pMunicipio.getNombre());
		this.actualizarRegistro(this.archivoMunicipios, tRegistro, 0);
	}
	
	/**
	 * Método que graba en el archivo correspondiente un registro con valores de los
	 * atributos del objeto de la clase Vereda dado como parámetro.
	 * 
	 * @pVereda : Parámetro con el objeto de la clase Municipio a ser grabado.
	 */
	
	public void grabarVereda(Vereda pVereda) {
		RegistroCsv tRegistro;
		tRegistro = new RegistroCsv();
		tRegistro.agregarValor(pVereda.getCodigoDane());
		tRegistro.agregarValor(pVereda.getNombre());
		this.grabarRegistro(this.archivoVeredas, tRegistro);
	}
	
	/**
	 * Método que construye un nuevo objeto de la clase Vereda con los valores de los atributos de su registro 
	 * almacenado en los archivos correspondientes, de donde los recupera utilizando un código DANE como parámetro de búsqueda.
	 */
	public Vereda recuperarVereda(String pCodigoDane) {
		Vereda rVereda;
		RegistroCsv tRegistro;
		tRegistro = this.recuperarRegistro(this.archivoVeredas, pCodigoDane, 0);
		rVereda = new Vereda();
		rVereda.setCodigoDane(tRegistro.extraerString(0));
		rVereda.setNombre(tRegistro.extraerString(1));
		return rVereda;
	}
	
	/**
	 * Método que reemplaza en el archivo correspondiente un registro con valores de los atributos 
	 * del objeto de la clase Vereda dado como parámetro.
	 * @pVereda : Parámetro con el objeto de la clase Vereda a ser grabado.
	 */
	public void actualizarVereda(Vereda pVereda) {
		RegistroCsv tRegistro;
		tRegistro = new RegistroCsv();
		tRegistro.agregarValor(pVereda.getCodigoDane());
		tRegistro.agregarValor(pVereda.getNombre());
		this.actualizarRegistro(this.archivoVeredas, tRegistro, 0);
	}
}
