public class Manzana implements Comparable<Manzana>{
	private String color;
	private int peso;
	private String variedad;

	public Manzana(String color, int peso, String variedad){
		this.color = color;
		this.peso = peso;
		this.variedad = variedad;
	}

	public String getColor(){
		return color;
	}
	public int getPeso(){
		return peso;
	}
	public String getVariedad(){
		return variedad;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setPeso(int peso){
		this.peso = peso;
	}
	public void setVariedad(String variedad){
		this.variedad = variedad;
	}

	private int indexarColor(){
		int n = 0;
		if (this.color.equals("amarillo"))
			n = 1;
		else if (this.color.equals("rojo"))
			n = 2;
		else if (this.color.equals("verde"))
			n = 3;
		return n;
	}

	public int compareTo(Manzana m){
		int result = 0;

		int colorM1 = this.indexarColor();
		int colorM2 = m.indexarColor();

		if (colorM1 > colorM2)
			result = 1;
		else if (colorM2 > colorM1)
			result = -1;
		else if (this.peso < m.peso)
			result = 1;
		else if (m.peso < this.peso)
			result = -1;
		else
			result = 0;

		return result;
	}

	public String toString(){
		return "Color: " + color + "\t   Peso: " + peso + "\t Variedad: " + variedad; 
	}
}
