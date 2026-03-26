import javax.swing.*;
public class menu {
    public static int main(String[]args){
        Object[] options = {
            "1.-suma",
            "2.-salir"
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
            selection = JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:\n1.- Cuadrado\n2.- Triángulo\n3.- Círculo\n4.- Salir",
                "Menú de figuras geométricas",
                JOptionPane.PLAIN_MESSAGE
            );
            if (selection != null && selection.equals("2.-salir")) {
                break;
                
            }
            
        } while (true);
    }
}