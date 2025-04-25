package inspeccion_fitosanitaria;

public class Cultivo {

    /**
     * Identificador único del cultivo
     */
    private String id;

    /**
     * Especie del cultivo
     */
    private String especie;

    /**
     * Método constructor de la clase. Inicializa los atributos id y especie como cadenas vacías.
     */
    public Cultivo() {
        this.id = "";
        this.especie = "";
    }

    /**
     * Método para asignación de valor al atributo id.
     * 
     * @pId : parámetro con el valor a asignar. Debe verificar que sea una cadena no vacía.
     */
    public void setId(String pId) {
        if (pId.length() > 0) {
            this.id = pId;
        }
    }

    /**
     * Método para asignación de valor al atributo especie.
     * 
     * @pEspecie : parámetro con el valor a asignar. Debe verificar que sea una cadena no vacía.
     */
    public void setEspecie(String pEspecie) {
        if (pEspecie.length() > 0) {
            this.especie = pEspecie;
        }
    }

    /**
     * Método para obtener el valor del atributo id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Método para obtener el valor del atributo especie.
     */
    public String getEspecie() {
        return this.especie;
    }
}