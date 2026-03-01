package U2P2;

public class Pedido {
    
    private String nombrePrimer;
    private double valorPrimer;
    private String nombreSegundo;
    private double valorSegundo;
    private String nombreBebida;
    private double valorBebida;
    private String nombrePostre;
    private double valorPostre;

    private void iniciarValoresPorDefecto() {
        nombrePrimer = "";
        valorPrimer = 0.0;
        nombreSegundo = "";
        valorSegundo = 0.0;
        nombreBebida = "";
        valorBebida = 0.0;
        nombrePostre = "";
        valorPostre = 0.0;
    }

    public Pedido(String n1, double v1) {
        iniciarValoresPorDefecto();
        nombrePrimer = n1;
        valorPrimer = v1;
    }

    public Pedido(String n1, double v1, String n2, double v2) {
        iniciarValoresPorDefecto();
        nombrePrimer = n1;
        valorPrimer = v1;
        nombreSegundo = n2;
        valorSegundo = v2;
    }

    public Pedido(String n1, double v1, String n2, double v2, 
                  String nb, double vb, String np, double vp) {
        iniciarValoresPorDefecto();
        nombrePrimer = n1;
        valorPrimer = v1;
        nombreSegundo = n2;
        valorSegundo = v2;
        nombreBebida = nb;
        valorBebida = vb;
        nombrePostre = np;
        valorPostre = vp;
    }

    public Pedido(String n1, double v1, String nb, double vb, boolean esBebida) {
        iniciarValoresPorDefecto();
        nombrePrimer = n1;
        valorPrimer = v1;
        nombreBebida = nb;
        valorBebida = vb;
    }

    public Pedido(String n1, double v1, String nb, double vb, String np, double vp) {
        iniciarValoresPorDefecto();
        nombrePrimer = n1;
        valorPrimer = v1;
        nombreBebida = nb;
        valorBebida = vb;
        nombrePostre = np;
        valorPostre = vp;
    }

    public double calcularTotal() {
        return valorPrimer + valorSegundo + valorBebida + valorPostre;
    }

    public void imprimir() {
        System.out.println("DETALLE DEL PEDIDO");
        if (valorPrimer > 0) 
            System.out.printf("1. Primer Plato : %-20s $ %.2f%n", nombrePrimer, valorPrimer);
        
        if (valorSegundo > 0) 
            System.out.printf("2. Segundo Plato: %-20s $ %.2f%n", nombreSegundo, valorSegundo);
        
        if (valorBebida > 0) 
            System.out.printf("3. Bebida       : %-20s $ %.2f%n", nombreBebida, valorBebida);
        
        if (valorPostre > 0) 
            System.out.printf("4. Postre       : %-20s $ %.2f%n", nombrePostre, valorPostre);
        System.out.printf("TOTAL A PAGAR       : $ %.2f%n", calcularTotal());
        System.out.println();
    }
}