public class Main{
	public static void main(String[] args){
		Objetos objs = new Objetos(3);
		String palabra = "hola";
		Coche coche = new Coche("GJ5H50", "negro", "Audi", 25251.00);
		Pizza pizza = new Pizza("PZ01", "pepperoni", 15.8);

		objs.guardarObjeto(pizza,2);
		objs.guardarObjeto(coche,0);
		objs.guardarObjeto(palabra,1);

		System.out.println(objs);

		objs.eliminarObjeto(0);

		System.out.println(objs);

		objs.guardarObjeto(new Pizza ("PZ02", "americana", 15.6), 0);

		System.out.println(objs);
		
		objs.eliminarTodo();

		System.out.println(objs);
	}
}
