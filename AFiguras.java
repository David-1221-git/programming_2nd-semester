import java.util.Scanner;


class Figura {


    
    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    public double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double volumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

    public static double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public static double volumenPiramide(double areaBase, double altura) {
        return (areaBase * altura) / 3.0;
    }
}

public class AFiguras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figura miFigura = new Figura(); 
        int opcionPrincipal;
        boolean salir = false;

        do {
            System.out.println("CALCULADORA GEOMETRICA");
            System.out.println("1. Calcular AREAS (Metodos de Instancia)");
            System.out.println("2. Calcular VOLUMENES (Metodos de Clase)");
            System.out.println("3. Salir");
            System.out.print("Por favor ingrese una opcion (1-3):");

            if (scanner.hasNextInt()) {
                opcionPrincipal = scanner.nextInt();
                
                switch (opcionPrincipal) {
                    case 1:
                        menuAreas(scanner, miFigura);
                        break;
                    case 2: 
                        menuVolumenes(scanner);
                        break;
                    case 3:
                        System.out.println("Usted esta saliendo del programa");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion invalida intente de nuevo.");
                }
            } else {
                System.out.println("Porfavor ingrese un numeron valido.");
                scanner.next();
            }

        } while (!salir);

        scanner.close();
    }


    private static void menuAreas(Scanner scanner, Figura figura) {
        System.out.println("\nBienvenido al menu de areas porfavor ingresa la figura a calcular");
        System.out.println("1. Cuadrado");
        System.out.println("2. Circulo");
        System.out.println("3. Rectángulo");
        System.out.print("¨Por fovor ingrese una opcion (1-3): ");
        
        int opcion = scanner.nextInt();
        double resultado = 0;

        switch (opcion) {
            case 1:
                System.out.print("Ingresa el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                resultado = figura.areaCuadrado(lado); 
                System.out.println("El area del cuadrado es: " + resultado);
                break;
            case 2:
                System.out.print("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();
                resultado = figura.areaCirculo(radio);
                System.out.println("El area del círculo es: " + String.format("%.2f", resultado));
                break;
            case 3:
                System.out.print("Ingresa la base del rectangulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresa la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                resultado = figura.areaRectangulo(base, altura); 
                System.out.println("El area del rectángulo es: " + resultado);
                break;
            default:
                System.out.println("Opcion ingresada no es valida.");
        }
    }
    private static void menuVolumenes(Scanner scanner) {
        System.out.println("\nBienvenido al menu de volumenes porfavor ingresa la figura a calcular");
        System.out.println("1. Cubo");
        System.out.println("2. Esfera");
        System.out.println("3. Piramide");
        System.out.print("Por favor ingrese una opcion (1-3): ");

        int opcion = scanner.nextInt();
        double resultado = 0;

        switch (opcion) {
            case 1:
                System.out.print("Ingresa el lado del cubo: ");
                double lado = scanner.nextDouble();
                resultado = Figura.volumenCubo(lado);
                System.out.println("El volumen del cubo es: " + resultado);
                break;
            case 2:
                System.out.print("Ingresa el radio de la esfera: ");
                double radio = scanner.nextDouble();
                resultado = Figura.volumenEsfera(radio); 
                System.out.println("El volumen de la esfera es: " + String.format("%.2f", resultado));
                break;
            case 3:
                System.out.print("Ingresa el área de la base de la piramide: ");
                double areaBase = scanner.nextDouble();
                System.out.print("Ingresa la altura de la piramide: ");
                double altura = scanner.nextDouble();
                resultado = Figura.volumenPiramide(areaBase, altura);
                System.out.println("El volumen de la piramide es: " + resultado);
                break;
            default:
                System.out.println("La opcion ingresada no es valida.");
        }
    }
}