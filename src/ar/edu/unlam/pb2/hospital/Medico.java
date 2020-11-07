package ar.edu.unlam.pb2.hospital;

public class Medico extends Empleado{
	
	private Integer matricula;
	
	public Medico(String nombre, String apellido, Integer dni, Integer id, String inicioDeActividad, Double sueldo, Integer matricula) {
		super(nombre, apellido, dni, id, inicioDeActividad, sueldo);
		this.matricula = matricula;
	}

	
	//HASCODE / EQUALS 
	
	
	@Override
	public Integer obtenerAntiguedad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer obtenerVacaciones() {
		// TODO Auto-generated method stub
		return null;
	}


	public Integer getMatricula() {
		return matricula;
	}


	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	
	
	
}
