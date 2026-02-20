package Platillos;
//import java.io.*;
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Ticket del cliente\n");


        Platillo plato1 = new Platillo();


        Platillo plato2 = new Platillo("Pasta Carbonara", 14.50);


        Platillo plato3 = new Platillo("Ramen Picante", 18.00, true);

        System.out.println("Platillo 1:");
        plato1.mostrarInfo();

        System.out.println("Platillo 2:");
        plato2.mostrarInfo();

        System.out.println("Platillo 3:");
        plato3.mostrarInfo();
    }
}
