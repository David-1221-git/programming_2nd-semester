import java.io.*;

public class sumas {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(isr); 
        System.out.println("Ingrese el primer número:");
        int num1 = Integer.parseInt(bReader.readLine()); 
        System.out.println("Ingrese el segundo número:");
        int num2 = Integer.parseInt(bReader.readLine()); 
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}