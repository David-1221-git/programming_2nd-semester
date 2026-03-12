import java.util.*;
/*Codigo: U2P6. Operaciones arreglos
Por: Merino Dominguez David */
public class U2P6 {
    public static void main(String[] args) {
                boolean condition = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Bienvenido al menu de volumenes de figuras geometricas");
            System.out.println("1. Llenar una arreglo");
            System.out.println("2. Imprimir un arreglos");
            System.out.println("3. sumar los elementos de un arreglo ");
            System.out.println("4.-salir");
            System.out.println("por favor ingrese una opcion");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                System.out.println("Bienvenido al llenado de un arreglo");
                System.out.println("Por favor ingrese el tamaño del arreglo");
                int t = scanner.nextInt();
                int[] arreglo = new int[t];
                for (int i = 0; i < t; i++) {
                    System.out.println("Ingrese el elemento " + (i + 1) + ":");
                    arreglo[i] = scanner.nextInt();
                }
                System.out.println("Arreglo llenado exitosamente");
                System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                int respuesta = scanner.nextInt();
                if (respuesta == 2) {   
                    condition = false;
                }
                    break;
                case 2:
                System.out.println("Bienvenido a la impresion de un arreglo");
                System.out.println("Por favor ingrese el tamaño del arreglo");
                int t2 = scanner.nextInt();
                int[] arreglo2 = new int[t2];
                for (int i = 0; i < t2; i++) {
                    System.out.println("Ingrese el elemento " + (i + 1) + ".-");
                    arreglo2[i] = scanner.nextInt();
                }
                    System.out.println("Los elementos del arreglo son.-");
                for (int i = 0; i < t2; i++) {
                    System.out.println((i + 1) + ".- " + arreglo2[i]);
                }
                 System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                int respuesta2 = scanner.nextInt();
                if (respuesta2 == 2) {   
                    condition = false;
                }
                    break;
                case 3:
                System.out.println("Bienvenido a la suma de los elementos de un arreglo");
                System.out.println("Por favor ingrese la cantidad de numeros que desea sumar");
                int t3 = scanner.nextInt();
                int[] arreglo3 = new int[t3];
                for (int i = 0; i < t3; i++) {
                    System.out.println("Ingrese el numero " + (i + 1) + ".-"); 
                    arreglo3[i] = scanner.nextInt();
                }
                int suma = 0;
                for (int i = 0; i < t3; i++) {  
                    suma += arreglo3[i];
                }
                System.out.println("La suma de los numeros del arreglo es.- " + suma);
                 System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                int respuesta3 = scanner.nextInt();
                if (respuesta3 == 2) {   
                    condition = false;
                }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa, hasta luego");
                    condition = false;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo ingresando el numero correspondiente a la opcion deseada");
                    break;
                }

        }while (condition); scanner.close();
    
    }
}
