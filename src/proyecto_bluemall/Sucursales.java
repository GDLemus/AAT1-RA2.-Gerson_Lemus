package proyecto_bluemall;

import java.util.LinkedList;

public class Sucursales {
    static LinkedList<Sucursales> sucursales = new LinkedList<>();
    private int scodigo;
    private String snombre;
    private String sdireccion;
    private String scorreo;
    private int stelefono;

    public Sucursales(int scodigo, String snombre, String sdireccion, String scorreo, int stelefono) {
        this.scodigo = scodigo;
        this.snombre = snombre;
        this.sdireccion = sdireccion;
        this.scorreo = scorreo;
        this.stelefono = stelefono;
    }

    public int getScodigo() {
        return scodigo;
    }

    public void setScodigo(int scodigo) {
        this.scodigo = scodigo;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getSdireccion() {
        return sdireccion;
    }

    public void setSdireccion(String sdireccion) {
        this.sdireccion = sdireccion;
    }

    public String getScorreo() {
        return scorreo;
    }

    public void setScorreo(String scorreo) {
        this.scorreo = scorreo;
    }

    public int getStelefono() {
        return stelefono;
    }

    public void setStelefono(int stelefono) {
        this.stelefono = stelefono;
    }
    
}
