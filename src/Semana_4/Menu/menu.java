package Semana_4.Menu;

import javax.swing.*;

class Menu {
    static Planeta planeta = null;
    static Automovil automovil = null;
    static Carrera carrera = null;
    static Facultad facultad = null;
    static Edificio edificio = null;

    public static void main(String[] args) {
        int op;

        do {
            //MENU PRINCIPAL
            op = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL \n" +
                    "1. Crear objetos" + "\n"
                    + "2. Imprimir objetos" + "\n"
                    + "3. Salir" + "\n"
                    + "Ingresa una opción:"
            ));

            switch (op) {
                case 1:
                    crearObjetosSubmenu();
                    break;
                case 2:
                    imprimirObjetosSubmenu();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Adiós, amigos");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (op != 3);
    }

    //SUBMENU DE CREAR
    private static void crearObjetosSubmenu() {
        int opcionCrear;

        do {
            opcionCrear = Integer.parseInt(JOptionPane.showInputDialog("SUBMENÚ - CREAR OBJETOS \n" +
                    "1. Crear Planeta" + "\n"
                    + "2. Crear Automovil" + "\n"
                    + "3. Crear Carrera" + "\n"
                    + "4. Crear Facultad" + "\n"
                    + "5. Crear Edificio" + "\n"
                    + "6. Volver al menú principal" + "\n"
                    + "Ingresa una opción:"
            ));

            switch (opcionCrear) {
                case 1:
                    llenarPlaneta();
                    JOptionPane.showMessageDialog(null, "Planeta creado y llenado");
                    break;
                case 2:
                    llenarAuto();
                    JOptionPane.showMessageDialog(null, "Automóvil creado");
                    break;
                case 3:
                    llenarCarrera();
                    JOptionPane.showMessageDialog(null, "Carrera creada");
                    break;
                case 4:
                    llenarFacultad();
                    JOptionPane.showMessageDialog(null, "Facultad creada");
                    break;
                case 5:
                    llenarEdificio();
                    JOptionPane.showMessageDialog(null, "Edificio creado");
                    break;
                case 6:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (opcionCrear != 6);
    }



    //SUBMENU DE IMPRIMIR
    private static void imprimirObjetosSubmenu() {
        int opcionImprimir;

        do {
            opcionImprimir = Integer.parseInt(JOptionPane.showInputDialog("SUBMENÚ - IMPRIMIR OBJETOS \n" +
                    "1. Imprimir Planeta" + "\n"
                    + "2. Imprimir Automóvil" + "\n"
                    + "3. Imprimir Carrera" + "\n"
                    + "4. Imprimir Facultad" + "\n"
                    + "5. Imprimir Edificio" + "\n"
                    + "6. Volver al menú principal" + "\n"
                    + "Ingresa una opción:"
            ));

            switch (opcionImprimir) {
                case 1:
                    if (planeta != null) {
                        String infoPlaneta = planeta.imprimirPlaneta();
                        JOptionPane.showMessageDialog(null, infoPlaneta);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay ningún planeta creado");
                    }
                    break;
                case 2:
                    if (automovil != null) {
                        String infoAuto = automovil.imprimirAuto();
                        JOptionPane.showMessageDialog(null, infoAuto);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay ningún automóvil creado");
                    }
                    break;
                case 3:
                    if (carrera != null) {
                        String infoCarrera = carrera.imprimirCarrera();
                        JOptionPane.showMessageDialog(null, infoCarrera);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay ninguna carrera creada");
                    }
                    break;
                case 4:
                    if (facultad != null) {
                        String infoFac = facultad.imprimirFacultad();
                        JOptionPane.showMessageDialog(null, infoFac);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay ninguna facultad creada");
                    }
                    break;
                case 5:
                    if (edificio != null) {
                        String infoEdificio = edificio.imprimirEdificio();
                        JOptionPane.showMessageDialog(null, infoEdificio);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay ningún edificio creado");
                    }
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (opcionImprimir != 6);
    }
    private static void llenarPlaneta() {
        planeta = new Planeta();

        planeta.setNombre(JOptionPane.showInputDialog("Ingresa el nombre del planeta:"));
        planeta.setColor(JOptionPane.showInputDialog("Ingresa el color del planeta:"));
        planeta.setForma(JOptionPane.showInputDialog("Ingresa la forma del planeta:"));
        planeta.setCompQuimica(JOptionPane.showInputDialog("Ingresa la composición química del planeta:"));
        planeta.setTam(Float.parseFloat(JOptionPane.showInputDialog("Ingresa el tamaño del planeta:")));
        int campoMag = Integer.parseInt(JOptionPane.showInputDialog("¿El planeta tiene campo magnético? 0: no, 1: sí"));
        planeta.setCampoMag(campoMag == 1);
        int atmosfera = Integer.parseInt(JOptionPane.showInputDialog("¿El planeta tiene atmósfera? 0: no, 1: sí"));
        planeta.setAtmosfera(atmosfera == 1);
        for (int i = 0; i < planeta.getPosicion().length; i++) {
            float ps = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la posición " + (i + 1) + " del planeta:"));
            planeta.getPosicion()[i] = ps;
        }
        planeta.setNumAnillos(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de anillos:")));
    }
    public static void llenarCarrera(){
        carrera = new Carrera();
        carrera.setNombre(JOptionPane.showInputDialog("Ingresa el nombre de la carrera: "));
        carrera.setArea(JOptionPane.showInputDialog("Ingresa el tipo de area de la carrera: "));
        carrera.setNumAlumnos(Integer.parseInt("Ingresa el numero de alumnos de la carrera: "));
        carrera.setNumProfes(Integer.parseInt("Ingresa el numero de profesores de la carrera: "));
    }

    public static void llenarEdificio(){
        edificio =new Edificio();
        edificio.setMaterialPiso(JOptionPane.showInputDialog("Ingresa el material del piso del edificio:"));
        edificio.setColor(JOptionPane.showInputDialog("Ingresa el color de afuera del edificio:"));
        edificio.setNumPisos(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de pisos:")));
        edificio.setNumVentanas(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de ventanas:")));
    }

    public static void llenarFacultad(){
        facultad =new Facultad();
        facultad.setNombre(JOptionPane.showInputDialog("Ingresa el nombre de la facultad: "));
        facultad.setAsociacion(JOptionPane.showInputDialog("Ingresa la asociacion de la facultad: "));
        facultad.setUbicacion(JOptionPane.showInputDialog("Ingresa la ubicacion de la facultad: "));
        facultad.setNumCarreras(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de carreras de la facultad: ")));
    }

    public static void llenarAuto(){
        automovil= new Automovil();
        automovil.setColor(JOptionPane.showInputDialog("Ingresa el color del auto: "));
        automovil.setMarca(JOptionPane.showInputDialog("Ingresa la marca: "));
        automovil.setModelo(JOptionPane.showInputDialog("Ingresa el modelo: "));
        automovil.setPlaca(JOptionPane.showInputDialog("Ingresa el placa: "));
        automovil.setNumSerie(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de serie")));

    }
}
