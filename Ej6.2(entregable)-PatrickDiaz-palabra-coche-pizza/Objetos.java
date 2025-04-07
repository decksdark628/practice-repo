public class Objetos implements ManipularEnLista{
	private Object[] listaDeObjetos;

	public Objetos(int capacidad){
		listaDeObjetos = new Object[capacidad];
	}

	public Object[] getListaDeObjetos(){
		return listaDeObjetos;
	}

	public boolean guardarObjeto(Object obj){
		boolean confirmacion = false;
		
		for (int i = 0; i < listaDeObjetos.length; i++){
			if (listaDeObjetos[i] == null && !confirmacion){
				listaDeObjetos[i] = obj;
				confirmacion = true;
			}
		}

		return confirmacion;
	}

	public Object obtenerObjeto(int indice){
		return listaDeObjetos[indice]; 
	}

	public boolean eliminarObjeto(int indice){
		boolean confirmacion = false;

		if (listaDeObjetos[indice] != null){
			listaDeObjetos[indice] = null;
			confirmacion = true;
		}
		
		return confirmacion;
	}

	public boolean eliminarTodo(){
		boolean confirmacion = true;
		
		for (int i = 0; i<listaDeObjetos.length && confirmacion; i++){
				confirmacion = this.eliminarObjeto(i);
		}
		return confirmacion;
	}

	public String toString(){
		String temp = "";

		for (int i = 0; i<listaDeObjetos.length; i++){
			temp += listaDeObjetos[i] + "\n";
		}

		return temp;
	}
}
