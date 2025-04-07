public class Coche{
	private String matricula;
	private String color;
	private String modelo;
	private double precio;

	public Coche(String matricula, String color, String modelo, double precio){
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMatricula(){
		return matricula;
	}
	public String getColor(){
		return color;
	}
	public String getModelo(){
		return modelo;
	}
	public double getPrecio(){
		return precio;
	}
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public void setPrecio(double precio){
		this.precio = precio;
	}

	public String toString(){
		return "Matricula: " + matricula + ", Color: " + color + ", Modelo: " + modelo + ", Precio: " + precio;
	}
}
