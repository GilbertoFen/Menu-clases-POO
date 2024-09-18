package Semana_4.Menu;

public class Automovil {
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private int numSerie;

    public int getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;

    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String imprimirAuto(){
        String cadenaRes= "" ;
        cadenaRes+= "Marca: " + marca + "\n"
                    + "Modelo: " + modelo + "\n"
                    + "Color: " + color + "\n"
                    + "Placa: " + placa + "\n"
                    + "Num Serie: " + numSerie + "\n";
        return cadenaRes;
    }


}
