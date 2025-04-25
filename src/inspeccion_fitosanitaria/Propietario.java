package inspeccion_fitosanitaria;

public class Propietario {

	/**
	 * Identificador único del propietario
	 */
	private String id;

	/**
	 * Nombre o razón social del propietario
	 */
	private String nombreCompleto;

	/**
	 * Documento de identificación del propietario
	 */
	private String cedula;

	/**
	 * Número de contacto del propietario
	 */
	private String telefono;

	/**
	 * Correo electrónico del propietario
	 */
	private String correo;

	/**
	 * Método constructor de la clase. Inicializa los atributos id, nombreCompleto,
	 * cedula, telefono y correo como cadenas vacías y los atributos cedula,
	 * telefono en cero.
	 */
	public Propietario() {
		this.id = "";
		this.nombreCompleto = "";
		this.cedula = "";
		this.telefono = "";
		this.correo = "";
	}

	/**
	 * Método para asignación de valor al atributo id.
	 * 
	 * @pId : parámetro con el valor a asignar. Debe verificar que sea una cadena no
	 *      vacía.
	 */
	public void setId(String pId) {
		if (pId.length() > 0) {
			this.id = pId;
		}
	}

	/**
	 * Método para asignación de valor al atributo nombreCompleto.
	 * 
	 * @pNombreCompleto : parámetro con el valor a asignar. Debe verificar que sea
	 *                  una cadena no vacía.
	 */
	public void setNombreCompleto(String pNombreCompleto) {
		if (pNombreCompleto.length() > 0) {
			this.nombreCompleto = pNombreCompleto;
		}
	}

	/**
	 * Método para asignación de valor al atributo cedula.
	 * 
	 * @pCedula : parámetro con el valor a asignar. Debe verificar que sea una
	 *          cadena no vacía.
	 */
	public void setCedula(String pCedula) {
		if (pCedula.length() > 0) {
			this.cedula = pCedula;
		}
	}

	/**
	 * Método para asignación de valor al atributo telefono.
	 * 
	 * @pTelefono : parámetro con el valor a asignar. Debe verificar que sea una
	 *            cadena no vacía.
	 */
	public void setTelefono(String pTelefono) {
		if (pTelefono.length() > 0) {
			this.cedula = pTelefono;
		}
	}

	/**
	 * Método para asignación de valor al atributo correo.
	 * 
	 * @pCorreo : parámetro con el valor a asignar. Debe verificar que sea una
	 *          cadena no vacía.
	 */
	public void setCorreo(String pCorreo) {
		if (pCorreo.length() > 0) {
			this.cedula = pCorreo;
		}
	}

	/**
	 * Método para obtener el valor del atributo id.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Método para obtener el valor del atributo nombreCompleto.
	 */
	public String getNombre() {
		return this.nombreCompleto;
	}
	
	/**
	 * Método para obtener el valor del atributo cedula.
	 */
	public String getCedula() {
		return this.cedula;
	}

	/**
	 * Método para obtener el valor del atributo telefono.
	 */
	public String getTelefono() {
		return this.telefono;
	}
	
	/**
	 * Método para obtener el valor del atributo correo.
	 */
	public String getCorreo() {
		return this.correo;
	}
}
