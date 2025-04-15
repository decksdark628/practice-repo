public class Main{
	private static void ordenar(Manzana[] vec){
		boolean huboCambio = true; 
		for (int end = vec.length; end > 1 && huboCambio; end--){
			huboCambio = false;
			for (int i = 0; i+1 < end; i++){
				if (vec[i].compareTo(vec[i+1]) < 0){
					Manzana temp = null;
					temp = vec[i];
					vec[i] = vec[i+1];
					vec[i+1] = temp;
					huboCambio = true;				
				}
			}
		}
	}
	
	public static void main(String[] args){
		Manzana[] vec = new Manzana[10];
		
		Manzana m1 = new Manzana("rojo", 170, "Fuji");
		Manzana m2 = new Manzana("rojo", 300, "Red delicious");
		Manzana m3 = new Manzana("amarillo", 150, "Gala");
		Manzana m4 = new Manzana("verde", 185, "Gala");
		Manzana m5 = new Manzana("amarillo", 220, "Honeycrisp");
		Manzana m6 = new Manzana("amarillo", 178, "Fuji");
		Manzana m7 = new Manzana("rojo", 180, "Gala");
		Manzana m8 = new Manzana("verde", 230, "Granny Smith");
		Manzana m9 = new Manzana("rojo", 140, "Fuji");
		Manzana m10 = new Manzana("amarillo", 209, "Gala");
		
		vec[0] = m1;
		vec[1] = m2;
		vec[2] = m3;
		vec[3] = m4;
		vec[4] = m5;
		vec[5] = m6;
		vec[6] = m7;
		vec[7] = m8;
		vec[8] = m9;
		vec[9] = m10;
		

		for (int i = 0; i<vec.length; i++){
			System.out.println(vec[i]+"\n");
		}
		System.out.println("\n");
		
		ordenar(vec);

		for (int i = 0; i<vec.length; i++){
			System.out.println(vec[i] + "\n"); 
		}
	}
}
