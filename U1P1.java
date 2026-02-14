import javax.swing.*;
public class U1P1 {
     public static void main(String[] args){
        Object[] options = {
            "1.-cuadrado",
            "2.-triangulo",
            "3.-salir"
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
            switch ((String)selection) {
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
                    JOptionPane.showMessageDialog(null, "Calculando el área del triangulo");
                    float base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
                    if (base < 0) {
                        JOptionPane.showMessageDialog(null, "El numero no puede ser negativo");
                        break;
                    }
                    float altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
                    if (altura<0) {
                        JOptionPane.showMessageDialog(null, "El numero no puede ser negativo");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "El area del triangulo es: " + (base * altura / 2));
                    String respuesta2 = JOptionPane.showInputDialog("Desea realizar otra operacion? (1:SI/2:NO)");
                    if (respuesta2.equalsIgnoreCase("2")) {
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
                case "3.-salir":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;   
                default:
                    break;
            }
            
        } while (selection != null && (String)selection != "3.-salir");

}
}