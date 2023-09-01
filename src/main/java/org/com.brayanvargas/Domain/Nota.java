package org.com.brayanvargas.Domain;

import java.util.ArrayList;

public class Nota {
    private double parcial;
    private double final_;
    private ArrayList<Double> notasSeguimiento;
    private Asignatura asignatura;

    public Nota(double parcial, double final_, Asignatura asignatura) {
        this.parcial = parcial;
        this.final_ = final_;
        this.asignatura = asignatura;
        this.notasSeguimiento = new ArrayList<>();
    }

    public Nota(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    private double calcularSeguimiento() {
        /* Alternativa al for
        double sumaNotas = this.notasSeguimiento.stream().mapToDouble(nota -> nota.doubleValue()).sum();
        */
        double sumaNotas = 0;
        for(int i=0; i<notasSeguimiento.size(); i++){
            sumaNotas += notasSeguimiento.get(i);
        }
        return sumaNotas/notasSeguimiento.size();
    }

    public double calcularDefinitiva() {
        return  (this.parcial*0.3)+
                (this.final_*0.3)+
                (calcularSeguimiento()*0.4);
    }

    public double getParcial() {
        return parcial;
    }

    public double getFinal_() {
        return final_;
    }

    public ArrayList<Double> getNotasSeguimiento() {
        return notasSeguimiento;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }


}
