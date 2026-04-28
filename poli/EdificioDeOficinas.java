public class EdificioDeOficinas implements Edificio{
    private int numOficinas;
    private double superficie;
    public EdificioDeOficinas(){
        numOficinas = 0;
        superficie = 0;
    }
    public EdificioDeOficinas(int numOficinas, double superficie){
        this.numOficinas = numOficinas;
         this.superficie = superficie;
    }
 public void setNumOficinas(int numOficinas){ this.numOficinas = numOficinas; }
    public void setSuperficie(double superficie){ this.superficie = superficie; }
    public int getNumOficinas(){ return numOficinas; }
    public double getSuperficieEdificio(){ return superficie; }
    public String toString(){
        Integer valorNumOficinas = numOficinas;
        Double valorSuperficie = superficie;
        return "Edificio tipo Edificio de Oficinas.\nNumero de oficinas: " + numOficinas + "\nSuperficie: "
            + superficie + "m2\n-------------------";
    }
}
