package Unidad1.Alumno;

public class Alumno {
    private String nombreMateria;
    private String nombreAlumno;
    private float examenParcial;
    private float practicas;
    private float examenFinal;
    private float asistencia;

    public Alumno(){};
    public Alumno(String nombreMateria, String nombreAlumno, float examenParcial, float practicas, float examenFinal, float asistencia) {
	this.nombreMateria = nombreMateria;
	this.nombreAlumno = nombreAlumno;
	this.examenParcial = validarEvaluacion(examenParcial);
	this.practicas = validarEvaluacion(practicas);
	this.examenFinal = validarEvaluacion(examenFinal);
	this.asistencia = asistencia;
}


	@Override
	public String toString() {
		return "Alumno {" +
				" Nombre='" + nombreAlumno + '\'' +
				", Materia='" + nombreMateria + '\'' +
				", Practicas=" + practicas +
				", Parcial=" + examenParcial +
				", Final=" + examenFinal +
				", Asistencia=" + asistencia +
				" }";
	}


	private float validarEvaluacion(float evaluacion) {
		if (evaluacion > 10) {
			
			System.out.println("La calificacion no puede ser mayor a diez");
			return 10;
		}
		if (evaluacion < 0) {
			System.out.println("La calificacion no puede ser menor a 0");
			return 0;
		}


		return evaluacion;
	}


	public void setExamenParcial(float examenParcial) {
		this.examenParcial = validarEvaluacion(examenParcial);
	}


	public float getExmanenParcial() {
		return this.examenParcial;
	}


	public float getPracticas() {
		return practicas;
	}


	public void setPracticas(float practicas) {
		this.practicas = validarEvaluacion(practicas);
	}


	public float getExamenFinal() {
		return examenFinal;
	}


	public void setExamenFinal(float examenFinal) {
		this.examenFinal = validarEvaluacion(examenFinal);
	}


	public String getNombreMateria() {
		return nombreMateria;
	}


	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}


	public String getNombreAlumno() {
		return nombreAlumno;
	}


	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}


	public float getAsistencia() {
		return asistencia;
	}


	public void setAsistencia(float asistencia) {
		this.asistencia = asistencia;
	}
}


