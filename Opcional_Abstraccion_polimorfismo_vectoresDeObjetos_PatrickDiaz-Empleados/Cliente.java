public class Cliente{
	private String nif;
	private String nombre;
	private String apellidos;
	private int edad;
	private double eurosPagados;

	public Cliente(String nif, String nombre, String apellidos, int edad, double eurosPagados){
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.eurosPagados = eurosPagados;
	}
}
