package Semana_4.Menu;

public class Edificio {
    private String color;
    private String materialPiso;
    private int numPisos;
    private int numVentanas;

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    public int getNumVentanas() {
        return numVentanas;
    }
    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterialPiso() {
        return materialPiso;
    }
    public void setMaterialPiso(String materialPiso) {
        this.materialPiso = materialPiso;
    }

    public String imprimirEdificio(){
        String cadenaRes = "";
        cadenaRes+="color: "+color+"\n"
                        +"materialPiso: "+materialPiso+"\n"
                        +"numPisos: "+numPisos+"\n"
                        +"numVentanas: "+numVentanas+"\n";
        return cadenaRes;
    }

}
