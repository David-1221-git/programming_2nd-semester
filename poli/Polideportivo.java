public class Polideportivo implements InstalacionDeportiva, Edificio{
      private String nombre;
      private int tipoDeInstalacion;
      private double superficie;      
      public Polideportivo(){
          nombre = "";
          tipoDeInstalacion = 0;
          superficie = 0;
      }
      public Polideportivo(String nombre, int tipoDeInstalacion, double superficie){
          this.nombre = nombre;
          this.tipoDeInstalacion = tipoDeInstalacion;
          this.superficie = superficie;
      }
      public void setNombre(String nombre){ this.nombre = nombre; }
    public void setTipoDeInstalacion(int tipoDeInstalacion){ this.tipoDeInstalacion = tipoDeInstalacion; }
    public void setSuperficie(double superficie){ this.superficie = superficie; }
    public String getNombre(){ return nombre; }
    public int getTipoDeInstalacion(){ return tipoDeInstalacion; }
    public double getSuperficieEdificio(){ return superficie; }
    public String toString(){
        return "Edificio tipo Polideportivo.\nNombre del polideportivo: " + nombre + "\nTipo de instalación: " 
            + tipoDeInstalacion + "\nSuperficie: " + superficie + "m2\n-----------------";
    }
}
