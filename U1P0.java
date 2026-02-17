import java.io.*;
//import java.lang.Math; en caso de usar pow para la potencias
/*Codigo: U1P0. Operaciones aritméticas con BufferedReader e InputStreamReader
Por: Merino Dominguez David */
public class U1P0 {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));//Resumen del ImoputStreamReader y el BufferedReader en una sola linea de codigo
        boolean menu = true;//Variable boleana para controlar el while en caso de tru continuar y si es false salir del programa
        while (menu) {//Ciclo while para mostra el menu al usuario asta que elija la opcion salir
            System.out.println("Bienvenido al menu de operaciones con numeros enteros");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opcion que desea realizar\n");
         try{
         int ope = Integer.parseInt(bReader.readLine());//Leo y el string y lo parseo en int
         switch (ope) {
            case 1://Caso para la suma de numeros enteros
                System.out.println("Bienvenido a la suma de numeros enteros");
                System.out.println("Ingrese el primer numero entero");
                int num1 = Integer.parseInt(bReader.readLine());
                System.out.println("Ingrese el segundo numero entero");
                int num2 = Integer.parseInt(bReader.readLine());
                System.out.println("El resultado de la suma es: " + (num1+num2));
                System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");//Mensaje para poder terminar o continuar el ciclo
                String respuesta = bReader.readLine();
                if (respuesta.equalsIgnoreCase("2")) {//Condicion para salir del ciclo
                    menu = false;
                }
                break;
            case 2://Caso para la resta de numeros enteros
                System.out.println("Bienvenido a la resta de numeros enteros");
                System.out.println("Ingrese el primer numero entero"); 
                int num3 = Integer.parseInt(bReader.readLine());
                System.out.println("Ingrese el segundo numero entero");
                int num4 = Integer.parseInt(bReader.readLine());
                System.out.println("El resultado de la resta es: " + (num3-num4));
                System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                String respuesta2 = bReader.readLine();
                if (respuesta2.equalsIgnoreCase("2")) {
                    menu = false;
                }
                break;
            case 3://Caso para la multiplicacion de numeros enteros
                System.out.println("Bienvenido a la multiplicacion de numeros enteros");
                System.out.println("Ingrese el primer numero entero");
                int num5 = Integer.parseInt(bReader.readLine());
                System.out.println("Ingrese el segundo numero entero");
                int num6 = Integer.parseInt(bReader.readLine());
                System.out.println("El resultado de la multiplicacion es: " + (num5*num6));
                System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                String respuesta3 = bReader.readLine();
                if (respuesta3.equalsIgnoreCase("2")) {
                    menu = false;
                }
                break;
            case 4://Caso para la division de numeros enteros
                System.out.println("Bienvenido a la division de numeros enteros");
                System.out.println("Ingrese el primer numero entero");
                int num7 = Integer.parseInt(bReader.readLine());
                System.out.println("Ingrese el segundo numero entero");
                int num8 = Integer.parseInt(bReader.readLine());
                if (num8 == 0) {
                    System.out.println("Error: No se puede dividir por cero.");
                } else {
                    System.out.println("El resultado de la division es: " + (num7/num8));
                }
                System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                String respuesta4 = bReader.readLine();
                if (respuesta4.equalsIgnoreCase("2")) {
                    menu = false;
                }
                break;
            case 5://Caso para la potencia de numeros enteros
                System.out.println("Bienvenido a la potencia de numeros enteros");
                System.out.println("Ingrese el numero a exponer");
                int num9 = Integer.parseInt(bReader.readLine());
                System.out.println("Ingrese el exponente");
                int num10 = Integer.parseInt(bReader.readLine());
                int pow=0;
                int poten=0;
                while (pow <= num10) {
                    if (pow == 0) {
                        poten = 1;
                    } else if (num10==0) {
                        poten = 1;
                        break;
                    } else {
                        poten = poten * num9;
                    }
                    pow++;
                }
                System.out.println("El resultado de la potencia es:"+ poten);
                //System.out.println("El resultado de la potencia es: " + (Math.pow(num9,num10))); con pow
                System.out.println("Desea realizar otra operacion? (1:SI/2:NO)");
                String respuesta5 = bReader.readLine();
                if (respuesta5.equalsIgnoreCase("2")) {
                    menu = false;
                }
                break;
            case 6://Caso para salir del programa
                System.out.println("Esta saliendo del programa Hasta pronto...");
                menu = false;
                break;
            default:
                System.out.println("Opcion no valida");//Mensaje de error para cuando el valor de ope no este en los casos
        }
        }catch(Exception e){
            System.out.println("Error: ingrese un numero entero valido " + e.getMessage());//Mensaje de errro cuando ope no sea int 
        }
     
        } 
        
         bReader.close();//Cierro el BufferedReader para liberar recursos
    }
}