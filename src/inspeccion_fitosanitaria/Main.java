package inspeccion_fitosanitaria;

public class Main {

	public static void main(String[] args) {

		Menu menu;
		int opcion;
		menu = new Menu();
		do {
			opcion = menu.capturarOpcion();
			switch (opcion) {
				case 1: {
					registrarDepartamento();
					break;
				}
				case 2: {
					consultarDepartamento();
					break;
				}
				case 3: {
					editarDepartamento();
					break;
				}
				case 4: {
					registrarMunicipio();
					break;
				}
				case 5: {
					consultarMunicipio();
					break;
				}
				case 6: {
					
					break;
				}
				case 7: {
					registrarVereda();
					break;
				}
				case 8: {
					consultarVereda();
					break;
				}
				case 9: {
					
					break;
				}
			}
		} while ((opcion > 0) && (opcion < 10));
	}
	
	public static void registrarDepartamento() {
		Departamento departamento;
		Presentacion presentacion;
		Datos datos;
		
		presentacion = new Presentacion();
		datos = new Datos();
		
		departamento = presentacion.capturarDepartamento();
		datos.grabarDepartamento(departamento);
		presentacion.presentarDepartamento(departamento);
	}

	public static void consultarDepartamento() {
		Departamento departamento;
		Presentacion presentacion;
		Datos datos;
		
		presentacion = new Presentacion();
		datos = new Datos();
		
		departamento = datos.recuperarDepartamento(presentacion.capturarCodigoDaneDepartamento());
		presentacion.presentarDepartamento(departamento);
	}
	
	public static void editarDepartamento() {
		Departamento departamento;
		Presentacion presentacion;
		Datos datos;
		
		presentacion = new Presentacion();
		datos = new Datos();
		
		departamento = datos.recuperarDepartamento(presentacion.capturarCodigoDaneDepartamento());
		presentacion.capturarEdicionDepartamento(departamento);
		datos.actualizarDepartamento(departamento);
	}
	
	public static void registrarMunicipio() {
		Municipio municipio;
		Presentacion presentacion;
		Datos datos;
		
		presentacion = new Presentacion();
		datos = new Datos();
		
		municipio = presentacion.capturarMunicipio();
		datos.grabarMunicipio(municipio);
		presentacion.presentarMunicipio(municipio);
	}
	
	public static void consultarMunicipio() {
		Municipio municipio;
		Presentacion presentacion;
		Datos datos;
		
		presentacion = new Presentacion();
		datos = new Datos();
		
		municipio = datos.recuperarMunicipio(presentacion.capturarCodigoDaneMunicipio());
		presentacion.presentarMunicipio(municipio);
	}
	
	public static void registrarVereda() {
		Vereda vereda;
		Presentacion presentacion;
		Datos datos;
		
		presentacion = new Presentacion();
		datos = new Datos();
		
		vereda = presentacion.capturarVereda();
		datos.grabarVereda(vereda);
		presentacion.presentarVereda(vereda);
	}
	
	public static void consultarVereda() {
		Vereda vereda;
		Presentacion presentacion;
		Datos datos;
		
		presentacion = new Presentacion();
		datos = new Datos();
		
		vereda = datos.recuperarVereda(presentacion.capturarCodigoDaneVereda());
		presentacion.presentarVereda(vereda);
	}
}
