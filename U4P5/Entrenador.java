package U4P5;

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion, int HorasDeVuelo, int HorarioPartido, String LugarPartido, String SeleccionLocal, String SeleccionVisitante, String Estadio, String LugarEntrenamiento) {
        super(id, nombre, apellidos, edad, HorasDeVuelo, HorarioPartido, LugarPartido, SeleccionLocal, SeleccionVisitante, Estadio, LugarEntrenamiento);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " se concentra para el partido.");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " viaja con el equipo a las " + getHorasDeVuelo() + " horas al lugar del partido " + getLugarPartido() + " para enfrentarse a la selección " + getSeleccionVisitante() + " en el estadio " + getEstadio() + " en el horario " + getHorarioPartido() + " horas. ");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " entrena al equipo para mejorar su rendimiento"+" en el lugar de entrenamiento "+getLugarEntrenamiento()+""+"Para el partodo contra la selección "+getSeleccionVisitante()+".");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador " + getNombre() + " " + getApellidos() + " dirige el partido desde la banda"+" con su identificación de federación " + getIdFederacion() + ".");
    }
    
}
