
package proyecto_bluemall;

import java.util.LinkedList;

public class Productos {
    
    static LinkedList<Productos> productos = new LinkedList<>();
    private int tcodigo;
    private String tnombre;
    private String tdescripcion;
    private String tcantidad;
    private int tprecio;

    public Productos(int tcodigo, String tnombre, String tdescripcion, String tcantidad, int tprecio) {
        this.tcodigo = tcodigo;
        this.tnombre = tnombre;
        this.tdescripcion = tdescripcion;
        this.tcantidad = tcantidad;
        this.tprecio = tprecio;
    }

    public int getTcodigo() {
        return tcodigo;
    }

    public void setTcodigo(int tcodigo) {
        this.tcodigo = tcodigo;
    }

    public String getTnombre() {
        return tnombre;
    }

    public void setTnombre(String tnombre) {
        this.tnombre = tnombre;
    }

    public String getTdescripcion() {
        return tdescripcion;
    }

    public void setTdescripcion(String tdescripcion) {
        this.tdescripcion = tdescripcion;
    }

    public String getTcantidad() {
        return tcantidad;
    }

    public void setTcantidad(String tcantidad) {
        this.tcantidad = tcantidad;
    }

    public int getTprecio() {
        return tprecio;
    }

    public void setTprecio(int tprecio) {
        this.tprecio = tprecio;
    }
    
     
}
