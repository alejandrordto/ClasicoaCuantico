package escuelaing.edu.co.clasicoCuantico;
/**
 *
 * @author Alejandro Rodriguez
 */
public class MarbleSimulator {
    private Double[][] sistema;
    private Double[] estado;
    public MarbleSimulator(){

    }

    public void setSistema(Double[][] sistema) {
        this.sistema = sistema;
    }

    public void setEstado(Double[] estado) {
        this.estado = estado;
    }

    public Double[] getEstado() {
        return estado;
    }

    public Double[][] getSistema() {
        return sistema;
    }
}
