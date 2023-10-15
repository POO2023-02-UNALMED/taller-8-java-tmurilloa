package futbol;

public class Portero extends Futbolista implements Comparable<Futbolista>{

	public short golesRecibidos;
	public byte dorsal;
	
	
	public Portero(String nombre, int edad, short golesRecibido,
			byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos = golesRecibido;	
		this.dorsal = dorsal;
	}

	public String toString() {
		String r = "El futbolista "+ getNombre() + " tiene "
				+ getEdad() + ", y jueda de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado  " + golesRecibidos ;
		
		return r;
	}
	public boolean jugarConLasManos() {
		return true;
	}
	public short compareTo(Portero otroFutbolista) {
		short diferencia = (short) Math.abs(this.golesRecibidos - otroFutbolista.golesRecibidos);
		
		return diferencia;
	}
}
