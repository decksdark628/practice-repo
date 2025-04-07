public class Pizza{
	private String codigo;
	private String tipo;
	private double radio;

	public Pizza(String codigo, String tipo, double radio){
		this.codigo = codigo;
		this.tipo = tipo;
		this.radio = radio;
	}

	public String getCodigo(){
		return codigo;
	}
	public String getTipo(){
		return tipo;
	}
	public double getRadio(){
		return radio;
	}
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public void setRadio(double radio){
		this.radio = radio;
	}
	
	public double calcularArea(){
		return radio * radio * Math.PI;
	}

	public double calcularPrecio(){
		double area = this.calcularArea();
		double precioBase;
		double precioFinal = 0;
		
		if (tipo.equals("americana")||tipo.equals("Florentina"))
			precioBase = 7.0;
		else if (tipo.equals("pepperoni") || tipo.equals("doble queso"))
			precioBase = 8.0;
		else if (tipo.equals("hawaiana") || tipo.equals("honolulu"))
			precioBase = 8.5;
		else if (tipo.equals("suprema"))
			precioBase = 9.0;
		else
			precioBase = 12.0;

		if (area > 0){ 
			 if (area <= 80.0)
				precioFinal = precioBase * 1.2;
			else if (area <= 100)
				precioFinal = precioBase * 1.5;
			else
				precioFinal = precioBase * 2.0;
		}

		return precioFinal;
	}

	public String toString(){
		return "Codigo: " +  codigo + ", Tipo: " + tipo + ", Radio: " + radio;
	}
}
