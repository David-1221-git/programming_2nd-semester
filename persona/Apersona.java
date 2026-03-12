package persona;
import java.util.Scanner;
import persona.persona;

public class Apersona{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de personas");
        System.out.println("ingrese la cantidad de personas que desea ingresar");
        int cantidad = scanner.nextInt();
        persona [] lasPersonas = new persona[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ".-");
            String nombre = scanner.next();
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ".-");
            int edad = scanner.nextInt();
            System.out.println("Ingrese la altura de la persona " + (i + 1) + ".-");
            float altura = scanner.nextFloat();
            System.out.println("Ingrese el salario de la persona " + (i + 1) + ".-");
            int salario = scanner.nextInt();
            lasPersonas[i] = new persona(nombre, edad, altura, salario);
        }
        System.out.println("Las personas ingresadas son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + lasPersonas[i].getNombre());
            System.out.println("Edad: " + lasPersonas[i].getEdad());
            System.out.println("Altura: " + lasPersonas[i].getAltura());
            System.out.println("Salario: " + lasPersonas[i].getSalario());
            System.out.println("------------------------------------------");
        }
        scanner.close();
    }
}