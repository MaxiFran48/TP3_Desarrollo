import chainofresponsability.Asistente;
import chainofresponsability.Coordinador;
import chainofresponsability.Profesor;
import chainofresponsability.Solicitud;
import command.AbandonarCursoCommand;
import command.Command;
import command.InscribirseCursoCommand;
import command.RemoteControl;
import iterator.Alumno;
import iterator.Curso;
import iterator.CursoIterator;
import mediator.*;
import memento.Examen;
import memento.Historial;
import observer.AlumnoObserver;
import observer.CursoObserver;
import observer.Observer;
import state.Inscripcion;
import state.Inscripto;
import strategy.*;
import templatemethod.ReporteAcademico;
import templatemethod.ReporteAlumno;
import templatemethod.ReporteCurso;
import visitor.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Chain of responsability
        System.out.println("=======Chain of responsability=======");

        // Creamos una solicitud de certificado
        Solicitud solicitud = new Solicitud("Solicitud de certificado", 2);

        // Creamos los handlers
        Asistente asistente = new Asistente();
        Profesor profesor = new Profesor();
        Coordinador coordinador = new Coordinador();

        asistente.setNext(profesor);
        profesor.setNext(coordinador);

        // Manejamos la solicitud
        asistente.handle(solicitud);


        // Command
        System.out.println("\n=======Command=======");

        // Creamos los comandos
        Command abandonarCurso = new AbandonarCursoCommand();
        Command inscribirseCurso = new InscribirseCursoCommand();

        // Creamos el control remoto
        RemoteControl control = new RemoteControl();

        control.setCommand(inscribirseCurso);

        // Nos inscribimos a un curso
        control.pressButon();

        control.setCommand(abandonarCurso);

        // Nos salimos del curso
        control.pressButon();

        // Cancelamos la salida
        control.pressUndo();


        // Iterator
        System.out.println("\n=======Iterator=======");

        //Creamos los objetos
        Alumno alumno1 = new Alumno("Juan", 123456);
        Curso curso1 = new Curso("Programacion");
        Curso curso2 = new Curso("Matematicas");
        Curso curso3 = new Curso("Fisica");
        Curso curso4 = new Curso("Quimica");
        Curso curso5 = new Curso("Biologia");
        Curso curso6 = new Curso("Historia");

        // Agregamos los cursos al alumno
        alumno1.agregarCurso(curso1);
        alumno1.agregarCurso(curso2);
        alumno1.agregarCurso(curso3);
        alumno1.agregarCurso(curso4);
        alumno1.agregarCurso(curso5);
        alumno1.agregarCurso(curso6);

        // Creamos el iterador
        CursoIterator iterador = alumno1.iterator();

        // Recorremos la lista
        System.out.println("Cursos del alumno " + alumno1.getNombre() + ":");
        while(iterador.hasNext()) {
            System.out.println(iterador.next().getNombre());
        }


        // Mediator
        System.out.println("\n=======Mediator=======");

        // Creamos el mediator
        ChatMediator mediator = new ChatRoom();

        // Creamos los usuarios
        Usuario alumno2 = new AlumnoMediator(mediator, "Juan");
        Usuario alumno3 = new AlumnoMediator(mediator, "Maria");
        Usuario profesor2 = new ProfesorMediator(mediator, "Pedro");

        // Agregamos los usuarios al mediator
        mediator.agregarUsuario(alumno2);
        mediator.agregarUsuario(alumno3);
        mediator.agregarUsuario(profesor2);

        // Enviamos mensajes
        alumno2.enviar("Hola, como estas?");
        profesor2.enviar("Hola, bienvenido al curso");
        alumno3.enviar("Hola, soy Maria");
        profesor2.enviar("Hola, soy Pedro");
        alumno2.enviar("Hola, soy Juan");


        // Memento
        System.out.println("\n=======Memento=======");

        // Creamos el examen
        Examen examen = new Examen();

        // Creamos el caretaker y el originator para el patrón Memento
        Historial historial = new Historial();

        // Agregamos preguntas al examen
        examen.agregarPregunta("¿Cuál es la capital de Francia?");
        examen.agregarPregunta("¿Cuánto es 2 + 2?");
        examen.agregarPregunta("¿Quién escribió 'Cien años de soledad'?");

        // Guardamos el estado actual del examen
        historial.guardar(examen.save());

        // Mostramos las preguntas actuales
        System.out.println("Preguntas actuales del examen:");
        
        for (String pregunta : examen.getPreguntas()) {
            System.out.println(pregunta);
        }

        // Agregamos otra pregunta
        examen.agregarPregunta("¿En qué año llegó el hombre a la Luna?");
        System.out.println("\nSe agregó una nueva pregunta.");
        System.out.println("Preguntas actuales del examen:");
        for (String pregunta : examen.getPreguntas()) {
            System.out.println(pregunta);
        }

        // Restauramos el examen al estado anterior (antes de la última pregunta)
        examen.restore(historial.deshacer());
        System.out.println("\nExamen restaurado al estado anterior:");
        System.out.println("Preguntas actuales del examen:");
        for (String pregunta : examen.getPreguntas()) {
            System.out.println(pregunta);
        }

        // Observer
        System.out.println("\n=======Observer=======");

        // Creamos el curso
        CursoObserver curso = new CursoObserver("Programacion", "Miercoles 10:00 - 12:00");

        // Creamos los observadores
        Observer alumno4 = new AlumnoObserver("Juan");
        Observer alumno5 = new AlumnoObserver("Maria");

        // Agregamos los observadores al curso
        curso.addObserver(alumno4);
        curso.addObserver(alumno5);

        // Cambiamos los horarios del curso
        curso.setHorarios("Lunes 10:00 - 12:00");
        curso.setHorarios("Martes 10:00 - 12:00");


        // State
        System.out.println("\n=======State=======");

        // Creamos la inscripcion
        Inscripcion inscripcion = new Inscripcion();
        
        // Cambiamos el estado a Inscripto
        inscripcion.completarInscripcion();

        // Cambiamos el estado a Cancelado
        inscripcion.cancelarInscripcion();

        // Probamos a volverlo a cancelar
        inscripcion.cancelarInscripcion();


        // Strategy
        System.out.println("\n=======Strategy=======");

        // Creamos el alumno
        AlumnoStrategy alumno6 = new AlumnoStrategy(new PromedioSimple());

        // Creamos la lista de notas
        List<Double> notas = Arrays.asList(8.0, 9.0, 10.0, 9.5, 6.4, 3.8);

        // Calculamos las notas
        alumno6.calcularNota(notas);

        alumno6.setCalculoNota(new ExamenExtra());
        alumno6.calcularNota(notas);

        alumno6.setCalculoNota(new PromedioPonderado());
        alumno6.calcularNota(notas);


        // Template Method
        System.out.println("\n=======Template Method=======");
        
        // Creamos el reporte academico
        ReporteAcademico reporteAcademico = new ReporteAlumno("Carlos");
        reporteAcademico.generarReporte();

        // Creamos el reporte academico
        reporteAcademico = new ReporteCurso("Programacion");
        reporteAcademico.generarReporte();


        // Visitor
        System.out.println("\n=======Visitor=======");

        // Creamos los alumnos
        AlumnoVisitor alumno7 = new AlumnoBecado("Maxi");
        AlumnoVisitor alumno8 = new AlumnoRegular("Pedro");

        // Creamos el visitante
        Visitor aplicarBecaVisitor = new AplicarBeca();

        // Calculamos los beneficios
        alumno7.aceptar(aplicarBecaVisitor);
        alumno8.aceptar(aplicarBecaVisitor);

    }
}
