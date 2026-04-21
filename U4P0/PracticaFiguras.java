package U4P0;
abstract class Figura {
    protected int x;
    protected int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();
}
class Rectangulo extends Figura {
    protected double ancho, alto;

    public Rectangulo(int x, int y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double area() {
        return ancho * alto;
    }
}
class Circulo extends Figura {
    protected double radio;

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
public class PracticaFiguras {
    public static void main(String[] args) {
        System.out.println("OBjeto circulo y rectángulo sin polimorfismo.-");
        Circulo c = new Circulo(0, 0, 5.5);
        System.out.println("Area del círculo: " + c.area());

        Rectangulo r = new Rectangulo(0, 0, 5.5, 2.0);
        System.out.println("Area del rectángulo: " + r.area());

        System.out.println("\nObjeto circulo y rectángulo con polimorfismo.-");
        // Variable de tipo Figura referenciando un objeto Circulo
        Figura f = new Circulo(0, 0, 5.5);
        System.out.println("Area del círculo (polimorfismo): " + f.area());

        // La misma variable ahora referencia un objeto Rectangulo
        f = new Rectangulo(0, 0, 5.5, 2.0);
        System.out.println("Area del rectángulo (polimorfismo): " + f.area());
    }
}