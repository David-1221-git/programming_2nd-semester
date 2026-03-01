package U2Prob3;
public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public static final char SEXO_HOMBRE = 'H';
    public static final char SEXO_MUJER = 'M';
    public static final int IMC_DEBAJO_PESO = -1;
    public static final int IMC_PESO_IDEAL = 0;
    public static final int IMC_SOBREPESO = 1;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_HOMBRE;
        this.peso = 0;
        this.altura = 0;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getDNI() { return DNI; }
    public char getSexo() { return sexo; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }

    public int calcularIMC() {
        if (this.altura == 0) return 0;
        double imc = this.peso / (this.altura * this.altura);

        if (imc < 20) {
            return IMC_DEBAJO_PESO;
        } else if (imc >= 20 && imc <= 25) {
            return IMC_PESO_IDEAL;
        } else {
            return IMC_SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        if (sexo == SEXO_HOMBRE || sexo == SEXO_MUJER) {
            return sexo;
        } else {
            return SEXO_HOMBRE;
        }
    }

    private String generaDNI() {
        int numero = (int) (Math.random() * 99999999);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int letraIndex = numero % 23;
        char letra = letras.charAt(letraIndex);
        return String.format("%08d", numero) + letra;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "DNI: " + DNI + "\n" +
               "Sexo: " + sexo + "\n" +
               "Peso: " + peso + " kg\n" +
               "Altura: " + altura + " m";
    }
}