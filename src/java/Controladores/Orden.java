package Controladores;

/*
 * New Ligths
 * Services info Web
 * Rubio Haro 
 */

/**
 *JAVA CLASS
 * @author Rod
 */
public class Orden {

    private String Nombre;
    private int CostoxUnidad;
    private int CostoTotal;
    private int cantidad;

    public Orden(String Nombre, int CostoxUnidad,int cantidad) {
        this.Nombre = Nombre;
        this.CostoxUnidad = CostoxUnidad;        
        this.cantidad = cantidad;
        ActualizarCostoTotal();
    }

    public void Añadir(int cantidadNueva) {
        this.cantidad = this.cantidad + cantidadNueva;
        ActualizarCostoTotal();
    }

    public void ActualizarCostoTotal(){
        this.CostoTotal = CostoxUnidad*cantidad;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCostoxUnidad() {
        return CostoxUnidad;
    }

    public void setCostoxUnidad(int CostoxUnidad) {
        this.CostoxUnidad = CostoxUnidad;
    }

    public int getCostoTotal() {
        return CostoTotal;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
