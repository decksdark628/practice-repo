public class Main{
	private static Rombo[] vec = new Rombo[10];

	public static void main(String[] args){
		for (int i = 0, j = 10, k = 1, l = 2; i<vec.length; i++){
			vec[i] = new Rombo((double)j+i, (double)k+i, (double)l+i);
		}

		for (int i = 0; i<vec.length; i++){
			System.out.println("\nRombo " + (i+1) + ":");
			System.out.println(vec[i]+"\n");
		}
	}
}
