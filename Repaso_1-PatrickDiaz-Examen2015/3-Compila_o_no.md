NO COMPILA

main no está declarado correctamente en la clase "programa". Se declara una  unica variable "args[]" de tipo String, en vez de un array de String:
	
	main(String args[])

Además de esto, asumiendo que todas las clases están en una misma carpeta, no hay ninguna otra razón por la que el código no compilaría.

