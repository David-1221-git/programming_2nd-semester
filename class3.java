import javax.swing.*;
public class class3 {
   public static void main(String[] args){  
            /**JOptionPane.showMessageDialog(
            null,                         // Parent component
            "This is a warning message!", // The message to display
            "Warning",                    // The title of the dialog box
          JOptionPane.WARNING_MESSAGE   // The message type (displays a standard warning icon)
        );*/
        String num1=JOptionPane.showInputDialog("Ingrese el primer numeron entero");
        int numint1= Integer.parseInt(num1);
        String num2=JOptionPane.showInputDialog("Ingrese el segundo nuemro entero");
        int numint2=Integer.parseInt(num2);
        //int resultado = numint1+numint2;
        JOptionPane.showConfirmDialog(null, "El resultado de la suuma es:"+(numint1+numint2),"Resultado",JOptionPane.PLAIN_MESSAGE);
    }
}
