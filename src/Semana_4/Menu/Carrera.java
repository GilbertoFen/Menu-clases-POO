package Semana_4.Menu;

public class Carrera {
    private String nombre;
    private int numAlumnos;
    private int numProfes;
    private String area;
    public int getNumAlumnos() {
        return numAlumnos;
    }
    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
    public int getNumProfes() {
        return numProfes;
    }
    public void setNumProfes(int numProfes) {
        this.numProfes = numProfes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public String imprimirCarrera() {
        String cadenaRes = "";
        cadenaRes+="nombre: "+nombre+"\n"
        +"numAlumnos: "+numAlumnos+"\n"
        +"numProfes: "+numProfes+"\n"
        +"area: "+area+"\n";
        return cadenaRes;
    }
}
