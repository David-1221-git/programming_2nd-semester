package U4P5;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    private int HorasDeVuelo;
    private int HorarioPartido;
    private String LugarPartido;
    private String SeleccionLocal;
    private String SeleccionVisitante;
    private String Estadio;
    private String LugarEntrenamiento;


    public SeleccionFutbol(int id, String nombre, String apellidos, int edad, int HorasDeVuelo, int HorarioPartido, String LugarPartido, String SeleccionLocal, String SeleccionVisitante, String Estadio, String LugarEntrenamiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.HorasDeVuelo = HorasDeVuelo;
        this.HorarioPartido = HorarioPartido;
        this.LugarPartido = LugarPartido;
        this.SeleccionLocal = SeleccionLocal;
        this.SeleccionVisitante = SeleccionVisitante;
        this.Estadio = Estadio;
        this.LugarEntrenamiento = LugarEntrenamiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getHorasDeVuelo() {
        return HorasDeVuelo;
    }  

    public void setHorasDeVuelo(int HorasDeVuelo) {
        this.HorasDeVuelo = HorasDeVuelo;
    }

    public int getHorarioPartido() {
        return HorarioPartido;
    }

    public void setHorarioPartido(int HorarioPartido) {
        this.HorarioPartido = HorarioPartido;
    }

    public String getLugarPartido() {
        return LugarPartido;
    }

    public void setLugarPartido(String LugarPartido) {
        this.LugarPartido = LugarPartido;
    }

    public String getSeleccionLocal() {
        return SeleccionLocal;
    }

    public void setSeleccionLocal(String SeleccionLocal) {
        this.SeleccionLocal = SeleccionLocal;
    }

    public String getSeleccionVisitante() {
        return SeleccionVisitante;
    }

    public void setSeleccionVisitante(String SeleccionVisitante) {
        this.SeleccionVisitante = SeleccionVisitante;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    public String getLugarEntrenamiento() {
        return LugarEntrenamiento;
    }
    
    public void setLugarEntrenamiento(String LugarEntrenamiento) {
        this.LugarEntrenamiento = LugarEntrenamiento;
    }  

}