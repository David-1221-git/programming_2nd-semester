package U4E1;


abstract class Parque {
    protected String nombre;
    protected double extension; 
    protected int numEspeciesAnimales;

    public Parque(String nombre, double extension, int numEspeciesAnimales) {
        this.nombre = nombre;
        this.extension = extension;
        this.numEspeciesAnimales = numEspeciesAnimales;
    }

    public String getNombre() { return nombre; }
    public double getExtension() { return extension; }
    public int getNumEspeciesAnimales() { return numEspeciesAnimales; }

    protected String formatearArray(String[] arr) {
        if (arr == null || arr.length == 0) return "N/A";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + 
               "\nExtensión: " + extension + " km²" + 
               "\nNº Especies Animales: " + numEspeciesAnimales;
    }
}