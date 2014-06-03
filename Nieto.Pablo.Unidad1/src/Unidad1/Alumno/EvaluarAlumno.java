package Unidad1.Alumno;

public class EvaluarAlumno {
    public static void main(String[] args) {
		Alumno a = new Alumno();
		a.setExamenParcial(8);
		System.out.println("Calificacion: " + a.getExmanenParcial());
		System.out.println(a);
	}
}

