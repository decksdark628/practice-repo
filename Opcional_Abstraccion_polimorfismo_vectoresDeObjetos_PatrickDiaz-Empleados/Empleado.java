public class Empleado{
	private String nombre;
	private String apellidos;
	private String DNI;
	private String direccion;
	private int anyosAntiguedad;
	private String telefonoContacto;
	private double salario;
	private Empleado supervisor;

	public Empleado(String nombre, String apellidos, String DNI, String direccion, int añosAntiguedad, String telefonoContacto, double salario, Empleado supervisor){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.añosAntiguedad = añosAntiguedad;
		this.telefonoContacto = telefonoContacto;
		this.salario = salario;
		this.supervisor = supervisor;
	}

	public Empleado(String nombre, String apellidos, String DNI, String direccion, int añosAntiguedad, String telefonoContacto, double salario){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.añosAntiguedad = añosAntiguedad;
		this.telefonoContacto = telefonoContacto;
		this.salario = salario;
	}

	public cambiarSupervisor(Empleado supervisor){
		this.suepervisor = supervisor; // is this correct or will it squash the previous value?
	}

	public String toString(){
		String temp = "Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni + ", Dirección:" + direccion + ", Años de antiguedad: " + anyosAntiguedad + ", Telefono de contacto: " + telefonoContacto + ", Salario: " + salario;
		if (supervisor != null)
			temp += ", Supervisor: " + super.supervisor;
		return temp;
	}
}
