package visitor;

public class AlumnoBecado extends AlumnoVisitor {


    public AlumnoBecado(String name) {
        super(name);
    }

    @Override
    public void aceptar(Visitor v) {
        v.visitar(this);
    }
}
