import java.util.*;
public class U1P2 {
    public static void main(String[]args){
        boolean condition = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Bienvenido al menu de volumenes de figuras geometricas");
            System.out.println("1.-esfera");
            System.out.println("2.-cubo");
            System.out.println("3.-piramide");
            System.out.println("4.-cono");
            System.out.println("5.-ortohedro");
            System.out.println("6.-salir");
            System.out.println("por favor ingrese una opcion");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al calculo del volumen de la esfera");
                    System.out.println("Ingrese el radio de la esfera");
                    float radio = scanner.nextFloat();
                    if (radio < 0) {
                        System.out.println("El numero no puede ser negativo intente de nuevo");
                        break;
                    }
                    System.out.println("El volumen de la esfera es: " + ((4.0/3.0)*Math.PI*Math.pow(radio, 3)));
                    System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                    int respuesta = scanner.nextInt();
                    if (respuesta == 2) {
                        condition = false;
                    }
                    break;
                case 2:
                    System.out.println("Bienvenido al calculo del volumen del cubo");
                    System.out.println("Ingrese el lado del cubo");
                    float lado = scanner.nextFloat();
                    if (lado < 0) {
                        System.out.println("El numero no puede ser negativo");
                        break;
                    }
                    System.out.println("El volumen del cubo es: " + (Math.pow(lado, 3)));
                    System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                    int respuesta2 = scanner.nextInt(); 
                    if (respuesta2 == 2) {
                        condition = false;
                    }
                    break;
                case 3:
                    System.out.println("Bienvenido al calculo del volumen de la piramide");
                    System.out.println("Ingrese el area de la base de la piramide");
                    float areaBase = scanner.nextFloat();
                    if (areaBase < 0) {
                        System.out.println("El numero no puede ser negativo");
                        break;
                    }
                    System.out.println("Ingrese la altura de la piramide");
                    float altura = scanner.nextFloat();
                    if (altura < 0) {
                        System.out.println("El numero no puede ser negativo");
                        break;
                    }
                    System.out.println("El volumen de la piramide es: " + ((areaBase * altura) / 3));
                    System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                    int respuesta3 = scanner.nextInt(); 
                    if (respuesta3 == 2) {
                        condition = false;
                    }
                    break;
                case 4:
                    System.out.println("Bienvenido al calculo del volumen del cono");
                    System.out.println("Ingrese el radio de la base del cono");
                    float radioBase = scanner.nextFloat();
                    if (radioBase < 0) {
                        System.out.println("El numero no puede ser negativo");
                        break;
                    }
                    System.out.println("Ingrese la altura del cono");
                    float alturaCono = scanner.nextFloat();
                    if (alturaCono < 0) {
                        System.out.println("El numero no puede ser negativo");
                        break;
                    }
                    System.out.println("El volumen del cono es: " + ((Math.PI * Math.pow(radioBase, 2) * alturaCono) / 3));
                    System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                    int respuesta4 = scanner.nextInt(); 
                    if (respuesta4 == 2) {
                        condition = false;
                    }
                    break;
                case 5:
                    System.out.println("Bienvenido al calculo del volumen del ortohedro");
                    System.out.println("Ingrese el largo del ortohedro");
                    float largo = scanner.nextFloat();
                    if (largo < 0) {
                        System.out.println("El numero no puede ser negativo intente de nuevo");
                        break;
                    }
                    System.out.println("Ingrese el ancho del ortohedro");
                    float ancho = scanner.nextFloat();
                    if (ancho < 0) {
                        System.out.println("El numero no puede ser negativo intente de nuevo");
                        break;
                    }
                    System.out.println("Ingrese el alto del ortohedro");
                    float alto = scanner.nextFloat();
                    if (alto < 0) {
                        System.out.println("El numero no puede ser negativo intente de nuevo");
                        break;
                    }
                    System.out.println("El volumen del ortohedro es: " + (largo * ancho * alto));
                    System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                    int respuesta5 = scanner.nextInt(); 
                    if (respuesta5 == 2) {
                        condition = false;
                    }
                    break;
                case 6:
                    System.out.println("Gracias por usar el programa, hasta luego!");
                    condition = false;
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo");
                    break;
                }

        }while (condition); scanner.close();
    }
}
