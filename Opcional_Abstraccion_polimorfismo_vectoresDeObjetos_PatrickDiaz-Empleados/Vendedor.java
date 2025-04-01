public class Vendedor extends Empleado{
	private Coche cocheDeEmpresa;
	private String telefono;
	private String areaVenta;
	private Cliente[] listaClientes;
	public static final double INCREMENTO_SALARIO_ANUAL = 0.10; // 10%
																
	public Vendedor(String nombre, String apellidos, String dni, String direccion, int anyosAntiguedad, String telefonoContacto, double salario, Empleado supervisor, Coche cocheDeEmpresa, String telefono, String areaVenta, int maxClientes){
		super(nombre, apellidos, dni, direccion, anyosAntiguedad, telefonoContacto, salario, supervisor);
		this.cocheDeEmpresa = cocheDeEmpresa;
		this.telefono = telefono;
		this.areaVenta = areaVenta;
		this.listaClientes = new Cliente[maxClientes];
	}

	public Vendedor(String nombre, String apellidos, String dni, String direccion, int anyosAntiguedad, String telefonoContacto, double salario, Empleado supervisor, Coche cocheDeEmpresa, String telefono, String areaVenta, Cliente[] listaClientes){
		super(nombre, apellidos, dni, direccion, anyosAntiguedad, telefonoContacto, salario, supervisor);
		this.cocheDeEmpresa = cocheDeEmpresa;
		this.telefono = telefono;
		this.areaVenta = areaVenta;
		this.listaClientes = listaClientes;
	}

	public boolean darDeAltaCliente(Cliente c){
		boolean confirmacion = false

		for (int i = 0; i<listaClientes.length && !confirmacion; i++){
			if (listaClientes[i] == null){
				listaClientes[i] = c;
				confirmacion = true;
			}
		}
		return confirmacion;
	}
	
	public boolean darDeBajaCliente(String nif){
		boolean confirmacion = false;

		for (int i = 0; i<listaClientes.length && !confirmacion; i++){
			if (listaClientes[i] != null && listaClientes[i].getNif().equals(nif)){
				listaClientes[i] = null;
				confirmacion = true;
			}
		}

		return confirmacion;
	}

	public boolean cambiarCoche(Coche c){ // cual es la diferencia con setCocheEmpresa?
		boolean confirmacion = false;

		this.cocheEmpresa = c;		

		return confirmacion
	}
