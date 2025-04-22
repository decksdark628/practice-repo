public class Rombo{
	private double diagonalMayor;
	private double diagonalMenor;
	private double lado;

	public Rombo(double dMay, double dMen, double lado){
		diagonalMayor = dMay;
		diagonalMenor = dMen;
		this.lado = lado;
	}

	public double getDiagonalMayor(){
		return diagonalMayor;
	}
	public double getDiagonalMenor(){
		return diagonalMenor;
	}
	public void setDiagonalMayor(double dMay){
		diagonalMayor = dMay;
	}
	public void setDiagonalMenor(double dMen){
		diagonalMenor = dMen;
	}

	public String toString(){
		return "Diagonal Mayor: " + diagonalMayor + ", Diagonal Menor: " + diagonalMenor + ", Lado: " + lado + " Area: " + calcularArea() + ", Perimetro: " + calcularPerimetro();
	}

	public double calcularArea(){
		return diagonalMayor*diagonalMenor*0.5;
	}

	public double calcularPerimetro(){
		return 4.0*lado;
	}
}
