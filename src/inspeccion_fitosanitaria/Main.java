package inspeccion_fitosanitaria;

public class Main {

	public static void main(String[] args) {
        Departamento departamento;
        Presentacion presentacion;
        presentacion = new Presentacion();
        departamento = presentacion.capturarDepartamento();
        presentacion.presentarDepartamento(departamento);
	}

}
