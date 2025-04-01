public class Secretario extends Empleado{
	private boolean tieneDespacho;
	private String numeroFax;
	private static final double INCREMENTO_SALARIO_ANUAL = 0.05; // 5%
	
	public Secretario(String nombre, String apellidos, String dni, String direccion, int anyosAntiguedad, String telefonoContacto, double salario, Empleado supervisor, boolean tieneDespacho, String numeroFax){
		super(nombre, apellidos, dni, direccion, anyosAntiguedad, telefonoContacto, salario, supervisor)
		this.tieneDespacho = tieneDespacho;
		this.numeroFax = numeroFax;
	}

	public boolean incrementarSalario(){
		boolean confirmacion = false;
		double salarioAnterior = super.salario
		
		super.salario += salarioAnterior + (salarioAnterior * INCREMENTO_SALARIO_ANUAL);
	}

	public String toString(){
		return super.toString() + ", Tiene despacho: " + tieneDespacho + ", Numero de fax: " + numeroFax;
	}
}
