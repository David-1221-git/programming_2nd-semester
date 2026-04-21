package U4P5;

public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia, int HorasDeVuelo, int HorarioPartido, String LugarPartido, String SeleccionLocal, String SeleccionVisitante, String Estadio, String LugarEntrenamiento) {
        super(id, nombre, apellidos, edad, HorasDeVuelo, HorarioPartido, LugarPartido, SeleccionLocal, SeleccionVisitante, Estadio, LugarEntrenamiento);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " se concentra para el partido.");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " viaja con el equipo"+" a las " + getHorasDeVuelo() + " horas al lugar del partido " + getLugarPartido() + " para enfrentarse a la selección " + getSeleccionVisitante() + " en el estadio " + getEstadio() + " en el horario " + getHorarioPartido() + " horas. ");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " Ayuda a preparar a los jugadores para el partido"+" en el lugar de entrenamiento "+getLugarEntrenamiento()+""+"Para el partodo contra la selección "+getSeleccionVisitante()+".");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " Se prepara en cadso de lesiones durante el partido"+" con su titulación de " + getTitulacion() + " y " + getAniosExperiencia() + " años de experiencia.");
    }   
    
}
