import java.util.Scanner;
/*Codigo: U2P10 Animal- Métodos de acceso
Por: Merino Dominguez David */
class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private String especie;
    private String tamaño;

    public Animal(String nombre, int edad, double peso, String especie, String tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
        this.tamaño = tamaño;
    }

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.especie = "";
        this.tamaño = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}

public class U2P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer animal con cinco atributos.-");
        System.out.println("Ingrese el nombre del aminal numero 1.-");
        String nombre = scanner.next();
        System.out.println("Ingrese la edad.-");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el peso.-");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese la especie.-");
        String especie = scanner.next();
        System.out.println("Ingrese el tamaño.-");
        String tamaño = scanner.next();

        Animal animal1 = new Animal(nombre, edad, peso, especie, tamaño);

        System.out.println("\nSegundo animal con tres atributos.-");
        System.out.println("Ingrese el nombre del aminal numero 2.-");
        String nombre2 = scanner.next();
        System.out.println("Ingrese la edad.-");
        int edad2 = scanner.nextInt();
        System.out.println("Ingrese el peso.-");
        double peso2 = scanner.nextDouble();

        Animal animal2 = new Animal(nombre2, edad2, peso2);

        System.out.println("\nAnimal 1: " + animal1.getNombre());
        System.out.println("Edad: " + animal1.getEdad());
        System.out.println("Peso: " + animal1.getPeso());
        System.out.println("Especie: " + animal1.getEspecie());
        System.out.println("Tamaño: " + animal1.getTamaño());
        System.out.println("\nAnimal 2: " + animal2.getNombre());
        System.out.println("Edad: " + animal2.getEdad());
        System.out.println("Peso: " + animal2.getPeso());

        scanner.close();
    }
}