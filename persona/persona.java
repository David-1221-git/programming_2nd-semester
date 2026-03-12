package persona;

public class persona {
    private String nombre;
    private int edad;
    private float altura;
    private int salario;
    public persona(String nombre, int edad, float altura, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.salario = salario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario() {
        return salario;
    }
}

