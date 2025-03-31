public class Empleado{
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private int anyosAntiguedad;
	private String telefonoContacto;
	private double salario;
	private Empleado supervisor;

	public Empleado(String nombre, String apellidos, String dni, String direccion, int anyosAntiguedad, String telefonoContacto, double salario, Empleado supervisor){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.anyosAntiguedad = anyosAntiguedad;
		this.telefonoContacto = telefonoContacto;
		this.salario = salario;
		this.supervisor = supervisor;
	}

	public Empleado(String nombre, String apellidos, String dni, String direccion, int anyosAntiguedad, String telefonoContacto, double salario){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.anyosAntiguedad = anyosAntiguedad;
		this.telefonoContacto = telefonoContacto;
		this.salario = salario;
	}

	public String getNombre(){
		return nombre;
	}

	public String getApellidos(){
		return apellidos;
	}
	public String getDni(){
		return dni;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	public void setDni(String dni){
		this.dni = dni;
	}

	public cambiarSupervisor(Empleado supervisor){
		this.supervisor = supervisor; // is this correct or will it squash the previous value?
	}

	public String toString(){
		String temp = "Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni + ", Dirección:" + direccion + ", Anyos de antiguedad: " + anyosAntiguedad + ", Telefono de contacto: " + telefonoContacto + ", Salario: " + salario;
		if (this.supervisor != null)
			temp += ", Supervisor: (" + supervisor.getNombre() + " " supervisor.getApellidos() + " - " + supervisor.getDni() + ")"; 
		return temp;
	}
}
