package chi;

public class Aplicacion {
    public static void main(String arg[]) {
        Autobus bus1 = new Autobus();

        bus1.setPatente("AX1313");
        bus1.setMarca("Tesla");
        bus1.setAsientos(40);

        System.out.println("AUTOBUS 1.-");
        System.out.println("Patente: " + bus1.getPatente());
        System.out.println("Marca: " + bus1.getMarca());
        System.out.println("Asientos: " + bus1.getAsientos());
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWwwwwwwwwwwwwwwwwwwwwwwwwww");
        Camion cam1 = new Camion();
        cam1.setPatente("BX1515");
        cam1.setMarca("Tsuru");
        cam1.setCarga(2000);

        System.out.println("CAMION 1.-");
        System.out.println("Patente: " + cam1.getPatente());
        System.out.println("Marca: " + cam1.getMarca());
        System.out.println("Carga: " + cam1.getCarga());
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWwwwwwwwwwwwwwwwwwwwwwwwwww");
        CamionCompartimientos cam2 = new CamionCompartimientos();
        cam2.setPatente("CX1818");
        cam2.setMarca("Ferrari");
        cam2.setCarga(2500);
        cam2.setCompartimientos(5);

        System.out.println("COMPARTIMIENTOS  caminon 2.-");
        System.out.println("Patente: " + cam2.getPatente());
        System.out.println("Marca: " + cam2.getMarca());
        System.out.println("Carga Total: " + cam2.getCarga());
        System.out.println("Carga por Compartimiento: " + cam2.CargaCompartimiento());
        System.out.println("Descripcion: " + cam2.Descripcion());
        System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWwwwwwwwwwwwwwwwwwwwwwwwwww");
    }
}