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

	public boolean agregarIngrediente(Ingrediente ing){
		boolean	confirmacion = false;

		for (int i = 0; i<ingredientes.length && !confirmacion; i++){
			if (ingredientes[i] == null){
				ingredientes[i] = ing;
				confirmacion = true;
			}
		}

		return confirmacion;
	}

	public boolean removerIngrediente(String nombre){
		boolean confirmacion = false;

		for (int i = 0; i<ingredientes.length && !confirmacion; i++){
			if (ingredientes[i].getNombre().equals(nombre)){
				ingredientes[i] = null;
				confirmacion = true;
			}
		}
		return confirmacion;
	}
}
