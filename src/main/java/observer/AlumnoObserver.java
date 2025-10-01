package observer;

public class AlumnoObserver implements Observer {

    private String nombre;

    public AlumnoObserver(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {
        System.out.println("Alumno " + nombre + " fue notificado con los nuevos horarios: " + msg);
    }
}
