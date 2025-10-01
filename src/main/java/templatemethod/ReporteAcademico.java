package templatemethod;

public abstract class ReporteAcademico {
    public void generarReporte() {
        generarEncabezado();
        generarContenido();
        generarPie();
    }

    protected void generarEncabezado() {
        System.out.println("Generando encabezado de reporte");
    }

    protected abstract void generarContenido();

    protected void generarPie() {
        System.out.println("Generando pie de reporte");
    };
}
