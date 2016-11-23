package Controladores;

import java.util.ArrayList;

/*
 * New Ligths
 * Services info Web
 * Rubio Haro 
 */
/**
 * JAVA CLASS
 *
 * @author Rod
 */
public final class ListaOrdenes {

    private final ArrayList<Orden> ListaOrdenes;
    private Orden OrdenDeInstancia;
    private final String Nombre;
    private int Total;
    private int Tamaño;

    public int GetTam(){
        return ListaOrdenes.size();
    }
    
    public Orden get(int i){
        return ListaOrdenes.get(i);
    }
    
    public ListaOrdenes(String Nombre) {
        this.Nombre = Nombre;
        ListaOrdenes = new ArrayList<>();
        GenerarLista();
    }
    public void AñadirPedido(String Element){
        int i;
        switch (Element) {
            case "Caesar Salad":
                i = 1;
                break;
            case "Maine Lobster Cocktail":
                i = 2;
                break;
            case "Broiled Sea Scallops":
                i = 3;
                break;
            case "Porterhouse Steak":
                i = 4;
                break;
            case "Cajun Ribeye Steak":
                i = 5;
                break;
            case "Chicago Style Prime Bone-In Ribeye":
                i = 6;
                break;
            case "Chadon Brut Classic":
                i = 7;
                break;
            case "MÖET & CHANDON":
                i = 8;
                break;
            case "CHÂTEAU MOUNTON ROTHSCHILD":
                i = 9;
                break;
            default:
                i = 100;
                break;
        }
           
        Orden ord = ListaOrdenes.get(i-1);
        ord.Añadir(1);
        ListaOrdenes.set(i-1, ord);
    }

    public String getNombre() {
        return Nombre;
    }

    public void Añadir(Orden ord) {
        ListaOrdenes.add(ord);
    }

    public ArrayList<Orden> getListaOrdenes() {
        return ListaOrdenes;
    }

    public void GenerarLista() {

        String E0 = "Caesar Salad";
        String E1 = "Maine Lobster Cocktail";
        String E2 = "Broiled Sea Scallops";
        String E3 = "Porterhouse Steak";
        String E4 = "Cajun Ribeye Steak";
        String E5 = "Chicago Style Prime Bone-In Ribeye";
        String E6 = "Chadon Brut Classic";
        String E7 = "MÖET & CHANDON";
        String E8 = "CHÂTEAU MOUNTON ROTHSCHILD";
        AñadirOrdenALista(E0, 250);
        AñadirOrdenALista(E1, 300);
        AñadirOrdenALista(E2, 130);
        AñadirOrdenALista(E3, 749);
        AñadirOrdenALista(E4, 800);
        AñadirOrdenALista(E5, 759);
        AñadirOrdenALista(E6, 7000);
        AñadirOrdenALista(E7, 5000);
        AñadirOrdenALista(E8, 6000);

    }

    public void AñadirOrdenALista(String Element, int costo) {
        Orden ordInss = new Orden(Element, costo, 0);
        ListaOrdenes.add(ordInss);
    }


    public int CalcularTotalAPagar() {
        Tamaño = ListaOrdenes.size();
        for (int i = 0; i < Tamaño; ++i) {
            OrdenDeInstancia = ListaOrdenes.get(i);
            Total = Total + OrdenDeInstancia.getCostoTotal();
        }
        return Total;
    }

}
