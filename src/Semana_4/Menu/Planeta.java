package Semana_4.Menu;

public class Planeta {
    private float tam;
    private float[] posicion = new float[3];
    private String nombre;
    private String color;
    private  String orbita;
    private String compQuimica;
    private boolean atmosfera;
    private boolean campoMag;
    private int numAnillos;
    private String forma;

    public float getTam() {
        return tam;
    }
    public void setTam(float tam) {
        this.tam = tam;
    }
    public float[] getPosicion() {
        return posicion;
    }
    public void setPosicion(float[] posicion) {
        this.posicion = posicion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getOrbita() {
        return orbita;
    }
    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }
    public String getCompQuimica() {
        return compQuimica;
    }
    public void setCompQuimica(String compQuimica) {
        this.compQuimica = compQuimica;
    }
    public boolean isAtmosfera() {
        return atmosfera;
    }
    public void setAtmosfera(boolean atmosfera) {
        this.atmosfera = atmosfera;
    }
    public boolean getCampoMag(boolean b) {
        return campoMag;
    }
    public void setCampoMag(boolean campoMag) {
        this.campoMag = campoMag;
    }
    public int getNumAnillos() {
        return numAnillos;
    }
    public void setNumAnillos(int numAnillos) {
        this.numAnillos = numAnillos;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }


    public String imprimirPlaneta(){
        String cadenaRes = " ";
        cadenaRes += "tam: " + tam + "\n"
        + "color: " + color + "\n"
        + "orbita: " + orbita + "\n"
        + "compQuimica: " + compQuimica + "\n"
        + "atmosfera: " + atmosfera + "\n"
        + "campoMag: " + campoMag + "\n"
        + "numAnillos: " + numAnillos + "\n"
        + "forma: " + forma + "\n";
        return cadenaRes;
    }
}
