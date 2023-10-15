package futbol;


public abstract class Futbolista implements Comparable<Futbolista> {
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this("Maradona",30,"delantero");
	}
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public String toString() {
		String r = "El futbolista " + nombre + " tiene " + edad + ", y juega de "
		+ posicion;
		return r;
	}
	
	public int compareTo(Futbolista f) {
		int resultado;
		if (this.nombre.equals(f.nombre) && this.edad == f.edad &&
				this.posicion.equals(f.posicion)) {
			resultado = 0;
		}
		else {resultado = -1;}
		
		return resultado;
	}
	public boolean equals(Futbolista f) {
		if (this.compareTo(f) == 0){
			return true;
		}
		else {
			return false;
		}
	}
	public abstract boolean jugarConLasManos();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}
}
