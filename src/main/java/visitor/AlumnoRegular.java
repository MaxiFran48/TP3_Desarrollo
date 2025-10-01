package visitor;

public class AlumnoRegular extends AlumnoVisitor {

    public AlumnoRegular(String name) {
        super(name);
    }

    @Override
    public void aceptar(Visitor v) {
        v.visitar(this);
    }
}
