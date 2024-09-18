package Semana_4.Menu;

public class Facultad {
    private String asociacion;
    private String nombre;
    private String ubicacion;
    private int numCarreras;

    public int getNumCarreras() {
        return numCarreras;
    }
    public void setNumCarreras(int numCarreras) {
        this.numCarreras = numCarreras;
    }
    public String getAsociacion() {
        return asociacion;
    }
    public void setAsociacion(String asociacion) {
        this.asociacion = asociacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String imprimirFacultad(){
        String cadenaRes="";
        cadenaRes +="Asociacion: "+asociacion+"\n"
        +"Nombre: "+nombre+"\n"
        +"Ubicacion: "+ubicacion+"\n"
        +"Carreras: "+numCarreras+"\n";
        return cadenaRes;
    }
    
}
