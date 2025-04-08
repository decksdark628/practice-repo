public interface ManipularEnLista{
	Object obtenerObjeto(int indice);
	boolean guardarObjeto(Object obj, int posicion);
	boolean eliminarObjeto(int indice);
	boolean eliminarTodo();
}
