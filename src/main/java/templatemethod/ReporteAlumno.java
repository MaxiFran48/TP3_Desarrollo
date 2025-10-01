package templatemethod;

public class ReporteAlumno extends ReporteAcademico {

    private String nombreAlumno;

    public ReporteAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    @Override
    protected void generarContenido() {
        System.out.println("Generando contenido personalizado para alumno " + nombreAlumno);
    }
}
