package utils;

public class PilaEstatica {
	
	public Integer tamañoPorDefecto = 7;
	public String[] pila;
	public Integer tope = -1;
	
	//CONSTRUCTOR
	public PilaEstatica(){
		pila = new String[this.tamañoPorDefecto];
	}
	//SOBRECARGA DE CONSTRUCTOR
	public PilaEstatica(Integer tamaño2) {
		tamañoPorDefecto = tamaño2;
		pila = new String[tamaño2];
	}
	
	public void insertar(String nombre) {
		tope++;
		pila[tope] = nombre;
	}
	
	public String eliminar() {
		String datoARetornar = "";
		datoARetornar = pila[tope];
		tope = tope - 1;
		return datoARetornar;
	}
	
	public boolean estaVacio() {
		if(tope == -1) {
			return true;
		}
		return false;
	}
	
}




