package templatemethod;

public class ReporteCurso extends ReporteAcademico {

    private String nombreCurso;

    public ReporteCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    @Override
    protected void generarContenido() {
        System.out.println("Generando contenido personalizado para curso de " + nombreCurso);
    }
}
