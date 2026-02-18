import javax.swing.*;
/*Codigo: U1P1. Areas de figuras geometricas con JOptionPane
Por: Merino Dominguez David */
public class U1P1 {
     public static void main(String[] args){
        Object[] options = {//Arreglo de objetos para mostrar las opciones del menu
            "1.-cuadrado",
            "2.-triangulo",
            "4.-salir", 
            "3.-circulo"
        };
        Object selection = JOptionPane.showInputDialog(
            null,
            "Seleccione una figura geometrica",
            "Menu de figuras geometricas",
            JOptionPane.PLAIN_MESSAGE,
            null,
            options,
            options[0]
        );
        do {
            switch ((String)selection) {//Switch para cada caso de las figuras geometricas dependiendo de la opcion que elija el usuario
                case "1.-cuadrado":
                    JOptionPane.showMessageDialog(null, "Bienvenido al calculo del area del cuadrado");
                    float num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero del lado del cuadrado"));
                    if (num < 0) {
                        JOptionPane.showMessageDialog(null, "El numero no puede ser negativo");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + (num * num));
                    String respuesta = JOptionPane.showInputDialog("Desea realizar otra operacion? (1:SI/2:NO)");
                    if (respuesta.equalsIgnoreCase("2")) {
                        selection = "3.-salir";
                    } else {
                        selection = JOptionPane.showInputDialog(
                            null,
                            "Seleccione una figura geometrica",
                            "Menu de figuras geometricas",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            options,
                            options[0]
                        );
                    }
                    break;
            
                case "2.-triangulo":
                    JOptionPane.showMessageDialog(null, "Bienvenido al calculo del area del triangulo");
                    float base = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese la base del triangulo:"));
                    if (base < 0) {
                        JOptionPane.showMessageDialog(null, "El numero a ingresar no puede ser negativo");
                        break;
                    }
                    float altura = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese la altura del triangulo"));
                    if (altura<0) {
                        JOptionPane.showMessageDialog(null, "El numero a ingresar no puede ser negativo");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "El area del triangulo es: " + (base * altura / 2));
                    String respuesta2 = JOptionPane.showInputDialog("Desea realizar otra operacion? (1:SI/2:NO)");
                    if (respuesta2.equalsIgnoreCase("2")) {//Condicion para salir del menu si no se cumple la condicion de 2 continua
                        selection = "3.-salir";
                    } else {
                        selection = JOptionPane.showInputDialog(//Si el usuario no desea salir se muestra el menu de nuevo con las opciones para repetir el siclo asta que elija salir
                            null,
                            "Seleccione una figura geometrica",
                            "Menu de figuras geometricas",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            options,
                            options[0]
                        );
                    }
                    break;
                case "3.-circulo":
                    JOptionPane.showMessageDialog(null, "Bienvenido al calculo del area del circulo");
                    float radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
                    if (radio < 0) {
                        JOptionPane.showMessageDialog(null, "El numero a ingresar no puede ser negativo");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "El area del circulo es: " + (3.1416 * radio * radio));
                    String respuesta3 = JOptionPane.showInputDialog("Desea realizar otra operacion? (1:SI/2:NO)");
                    if (respuesta3.equalsIgnoreCase("2")) {
                        selection = "3.-salir";
                    } else {
                        selection = JOptionPane.showInputDialog(
                            null,
                            "Seleccione una figura geometrica",
                            "Menu de figuras geometricas",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            options,
                            options[0]
                        );
                    }
                    break;
                case "4.-salir":
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa, hasta luego vuelva pronto");
                    break;   
                default:
                    break;
            }
            
        } while (selection != null && (String)selection != "3.-salir");//Condicion para mantener el menu hasta que el usuario decida salir

}
}