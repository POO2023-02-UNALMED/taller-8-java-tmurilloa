package futbol;

public class Portero extends Futbolista implements Comparable<Object>{

	public short golesRecibidos;
	public byte dorsal;
	
	
	public Portero(String nombre, int edad, short golesRecibido,
			byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos = golesRecibido;	
		this.dorsal = dorsal;
	}

	public String toString() {
		String r = super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos ;
		
		return r;
	}
	public boolean jugarConLasManos() {
		return true;
	}
	@Override
	public int compareTo(Object o) {
		int diferencia =  Math.abs(this.golesRecibidos - ((Portero)o).golesRecibidos);
		
		return diferencia;
	}
}
