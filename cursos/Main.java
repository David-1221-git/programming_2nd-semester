package cursos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Plataforma Educativa.-\n");
        System.out.println("Mostrando informacion de corsos elejidos.-\n");


        CursoCertificado cursoAvanzado = new CursoCertificado(
            "Carnitas ++ avanzado", 
            20, 
            1560.0, 
            "Tecnológico Nacional de México Campus Querétaro", 
            true
        );
        CursoCertificado cursoIntermedio = new CursoCertificado(
            "Carnitas ++ intermedio", 
            15, 
            1983.0, 
            "Tecnológico Nacional de México Campus Querétaro", 
            false
        );
        CursoCertificado cursoPersonalizado = new CursoCertificado(
            "Carnitas ++ personalizado", 
            98, 
            50000.0, 
            "Tecnológico Nacional de México Campus Querétaro", 
            false
        );

        System.out.println("1. Mostrando informacion del Curso intermedio.-");
        cursoIntermedio.mostrarInfo();
        
        System.out.println("\n2. Mostrando informacion del Curso Avanzado.-");
        cursoAvanzado.mostrarInfo();

        System.out.println("\n2. Mostrando informacion del Curso Personalizado.-");
        cursoPersonalizado.mostrarInfo();
        System.out.println("\n3. Calculo de costos (Precio Final):");
        System.out.println("Costo Curso Intermedio: $" + cursoIntermedio.calcularCosto());
        System.out.println("Costo Curso Avanzado (con +20%): $" + cursoAvanzado.calcularCosto());
        System.out.println("Costo Curso Personalizado: $" + cursoPersonalizado.calcularCosto());

        double descuento = 15.0;
        System.out.println("\n4. Aplicando descuento del " + descuento + "%:");
        System.out.println("Costo Curso Intermedio con descuento: $" + cursoIntermedio.calcularCosto(descuento));
        System.out.println("Costo Curso Personalizado con descuento: $" + cursoPersonalizado.calcularCosto(descuento));

        
        double costoCertificadoBase = cursoAvanzado.calcularCosto();
        double costoCertificadoConDescuento = costoCertificadoBase - (costoCertificadoBase * (descuento/100));
        System.out.println("Costo Curso Avanzado con descuento (sobre precio final): $" + costoCertificadoConDescuento);

        System.out.println("\n5. Emision de certificados:");
        cursoAvanzado.emitirCertificado();
        
        CursoCertificado cursoSinCert = new CursoCertificado("Taller Libre", 20, 20.0, "Tecnológico Nacional de México Campus Querétaro", false);
        cursoSinCert.emitirCertificado();

        System.out.println("\nSaliendo del Sistema.Vuelva pronto.");
    }
}