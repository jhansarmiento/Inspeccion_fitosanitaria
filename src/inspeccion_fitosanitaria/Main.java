package inspeccion_fitosanitaria;

public class Main {

	public static void main(String[] args) {
        Departamento departamento;
        Municipio municipio;
        Vereda vereda;
        
        Presentacion presentacion;
        presentacion = new Presentacion();
        
        departamento = presentacion.capturarDepartamento();
        municipio = presentacion.capturarMunicipio();
        vereda = presentacion.capturarVereda();
        
        presentacion.presentarDepartamento(departamento);
        presentacion.presentarMunicipio(municipio);
	}

}
