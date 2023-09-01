package org.com.brayanvargas.App;

import org.com.brayanvargas.Domain.Asignatura;
import org.com.brayanvargas.Domain.Docente;
import org.com.brayanvargas.Domain.Estudiante;
import org.com.brayanvargas.Domain.Nota;

public class App {
    public static void main(String[] args) {

        Asignatura asignatura = new Asignatura("Diseño software IV");
        Docente docente = new Docente("1234", "Jhon Duque");

        Estudiante estudiante = new Estudiante("10014", "Brayan");
        Estudiante estudiante2 = new Estudiante("321", "Felipe");

        Nota notaBrayan = new Nota(5, 5, asignatura);
        notaBrayan.getNotasSeguimiento().add(5.0);
        notaBrayan.getNotasSeguimiento().add(4.0);
        notaBrayan.getNotasSeguimiento().add(1.0);
        notaBrayan.getNotasSeguimiento().add(3.0);

        double definitiva = notaBrayan.calcularDefinitiva();
        if (definitiva >= 3.5){
            System.out.println(estudiante.getNombre() + " ganó con una nota de: " + definitiva);
        } else {
            System.out.println(estudiante.getNombre() + " perdió, suerte para la próxima, sacaste: " + definitiva);
        }
    }
}
