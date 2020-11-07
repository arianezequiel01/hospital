package ar.edu.unlam.pb2.hospital;

import java.util.HashSet;

public class SistemaHospital {

	private String nombre;
	private HashSet<Medico> medicos;
	private HashSet<Paciente> pacientes;
	private HashSet<Especialidad> especialidades;
	private HashSet<Piso> pisos;
	private HashSet<Turno> turnosAsignados;
	private HashSet<Administrativo> administrativos;
	private HashSet<Internacion> internacionesIngresadas;
	private HashSet<ConsultaSinTurno> consultasSinTurno;
	private HashSet<ConsultaConTurno> consultasConTurno;
	
	
	public SistemaHospital(String nombre) {
		this.nombre = nombre;
		this.medicos = new HashSet<>();
		this.pacientes = new HashSet<>();
		this.especialidades = new HashSet<>();
		this.pisos = new HashSet<>();
		this.turnosAsignados = new HashSet<>();
		this.administrativos = new HashSet<>();
		this.internacionesIngresadas = new HashSet<>();
		this.consultasSinTurno = new HashSet<>();
		this.consultasConTurno = new HashSet<>();
	}
	
	public Boolean registrarMedico(Medico medico) {
		
		return null;
	}
	
	public Boolean registrarPaciente(Paciente paciente) {
		
		return null;
	}
	
	public Boolean registrarPersonalAdministrativo(Administrativo administrativo) {
		
		return null;
	}
	
	public Boolean agregarEspecialidad(Especialidad especialidad) {
		
		return null;
	}
	
	public Boolean registrarPiso(Piso piso) {
		
		return null;
	}
	
	public Boolean asignarHabitacionParaInternacion(Integer dni, Piso piso, Integer habitacion) {
		
		return null;
	}
	
	public Boolean asignarTurnoAPaciente(Integer dni, Especialidad especialidad, Integer idMedico) {
		
		return null;
	}
	
	public Boolean cancelarTurno(Integer id, Integer dni) {
		
		return null;
	}
	
	public Boolean cambiarTurno(Integer id, Integer dni) {
		
		return null;
	}
	
	public Boolean darDeBajaUnMedico(Integer dni) {
		
		return null;
	}
	
	public Boolean cambiarDeEspecialidadAUnMedico(Integer dni, Integer idEspecialidad) {
		
		return null;
	}
	
	
	public Boolean consultarDisponibilidadDeUnTurno(Integer idTurno) {
		
		return null;
	}
	
	public Boolean consultarDisponibilidadDeUnaHabitacion(Integer numeroPiso, Integer habitacion) {
		
		return null;
	}
	
	
	public Boolean crearNuevaConsultaConTurno(Integer idTurnoAsignado, Integer dni) {
		
		return null;
	}
	
	public Boolean crearNuevaConsultaSinTurno(Paciente paciente, Especialidad especialidad, Integer idMedico) {
		
		return null;
	}
	
	public Integer obtenerCantidadDePacientesInternados() {
		
		return null;
	}
	
	public Integer obtenerCantidadDeConsultasPorEspecialidad() {
		
		return null;
	}
	
	public HashSet<String> obtenerListaDeHabitacionesDisponibles(Integer piso){
			
		return null;
	}
	
	public Integer obtenerCantidadDeHabitacionesDisponibles() {
		
		return null;
	}
	
	public Integer obtenerCantidadDePersonasQueNoAsistieronAlTurno() {
		
		return null;
	}
	
	public HashSet<Paciente> obtenerListaDePacientesQueNoAsistieronAlTurno(){
		
		return null;
	}
	
	public HashSet<Medico> obtenerListaDeMedicosDeUnaEspecialidad(Integer idEspecialidad){
		
		return null;
	}
	
	public HashSet<Turno> obtenerListaDeTurnosDeUnPaciente(Integer dni){
		
		return null;
	}
	
	
	
	
}
