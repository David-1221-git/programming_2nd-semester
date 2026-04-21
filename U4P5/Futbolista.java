package U4P5;

public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion, int HorasDeVuelo, int HorarioPartido, String LugarPartido, String SeleccionLocal, String SeleccionVisitante, String Estadio, String LugarEntrenamiento) {
        super(id, nombre, apellidos, edad, HorasDeVuelo, HorarioPartido, LugarPartido, SeleccionLocal, SeleccionVisitante, Estadio, LugarEntrenamiento);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " se concentra para el partido.");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " viaja con el equipo a las "+getHorasDeVuelo()+" horas al lugar del partido "+getLugarPartido()+" para enfrentarse a la selección "+getSeleccionVisitante()+" en el estadio "+getEstadio()+" en el horario "+getHorarioPartido()+" horas. ");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " entrena para mejorar su rendimiento"+""+"en el lugar de entrenamiento "+getLugarEntrenamiento()+".");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " juega un partido de fútbol"+" con el dorsal "+getDorsal()+" y la demarcación de "+getDemarcacion()+".");
    }
    
}
