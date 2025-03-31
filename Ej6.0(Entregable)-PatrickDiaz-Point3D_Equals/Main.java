public class Main{
	public static void main(String[] args){
		Punto3D p1 = new Punto3D(-8, 12, 5);
		Punto3D p2 = new Punto3D(-8, 12, 4);

		System.out.println(p1);
		System.out.println(p2);

		if (p1.equals(p2))
			System.out.println("Son iguales");
		else 
			System.out.println("No son iguales\n");

		p2.setZ(5);

		System.out.println(p1);
		System.out.println(p2);

		if (p1.equals(p2))
			System.out.println("Son iguales");
		else 
			System.out.println("No son iguales\n");
	}
}
