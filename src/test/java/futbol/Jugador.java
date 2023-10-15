package futbol;

public class Jugador extends Futbolista implements Comparable<Futbolista>{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	public Jugador(String nombre, int edad, String posicion,short golesMarcados,
			byte dorsal) {
		super(nombre,edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}
	public String toString() {
		String r = "El futbolista " + getNombre() + " tiene " +
	getEdad() + ", y juega de " + getPosicion() + " con el dorsal " +
				dorsal + ".Ha marcado " + golesMarcados;
		
		return r;
	}
	public int compareTo(Futbolista otroFutbolista ) {
		int diferencia = Math.abs(this.getEdad() - otroFutbolista.getEdad());
		
		return diferencia;
	}
}
