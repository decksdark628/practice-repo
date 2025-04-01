public class Pizza{
	private String codigo;
	private String tipo;
	private double radio;
	private Ingrediente[] ingredientes;

	public Pizza(String codigo, String tipo, double radio, Ingrediente[] ingredientes){
		this.codigo = codigo;
		this.tipo = tipo;
		this.radio = radio;
		this.ingredientes = ingredientes;
	}
	
	public double calcularPrecio(){
		double precioBase;
		
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

	

	}

	public double calcularArea(){
	}

	public boolean agregarIngrediente(){
	}

	public boolean removerIngrediente(){
	}



}
