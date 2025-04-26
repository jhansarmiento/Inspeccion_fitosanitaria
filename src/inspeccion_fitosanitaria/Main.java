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

					break;
				}
				case 2: {

					break;
				}
			}
		} while ((opcion > 0) && (opcion < 3));

		Municipio municipio;
		Vereda vereda;

		Presentacion presentacion;
		presentacion = new Presentacion();

		municipio = presentacion.capturarMunicipio();
		vereda = presentacion.capturarVereda();

		presentacion.presentarMunicipio(municipio);
		presentacion.presentarVereda(vereda);
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

}
