package visitor;

public abstract class AlumnoVisitor {

    private String name;

    public AlumnoVisitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void aceptar(Visitor v);
}
