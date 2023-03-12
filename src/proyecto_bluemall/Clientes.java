
package proyecto_bluemall;

import java.util.LinkedList;

public class Clientes {
    
    static LinkedList<Clientes> clientes = new LinkedList<>();
    private int ccodigo;
    private String cnombre;
    private int cnit;
    private String ccorreo;
    private String cgenero;
    private String cpass;

    public Clientes(int ccodigo, String cnombre, int cnit, String ccorreo, String cgenero, String cpass) {
        this.ccodigo = ccodigo;
        this.cnombre = cnombre;
        this.cnit = cnit;
        this.ccorreo = ccorreo;
        this.cgenero = cgenero;
        this.cpass = cpass;
    }

    public static LinkedList<Clientes> getClientes() {
        return clientes;
    }

    public static void setClientes(LinkedList<Clientes> clientes) {
        Clientes.clientes = clientes;
    }

    public int getCcodigo() {
        return ccodigo;
    }

    public void setCcodigo(int ccodigo) {
        this.ccodigo = ccodigo;
    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public int getCnit() {
        return cnit;
    }

    public void setCnit(int cnit) {
        this.cnit = cnit;
    }

    public String getCcorreo() {
        return ccorreo;
    }

    public void setCcorreo(String ccorreo) {
        this.ccorreo = ccorreo;
    }

    public String getCgenero() {
        return cgenero;
    }

    public void setCgenero(String cgenero) {
        this.cgenero = cgenero;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

}
