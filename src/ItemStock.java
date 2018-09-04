import java.util.Date;

public class ItemStock {
	private Computadora c;
	private int cantidad;
	private Date ultimaFechaModificacion;
	
	public ItemStock(Computadora c, int cantidad, Date ultimaFechaModificacion) {
		this.c = c;
		this.cantidad = cantidad;
		this.ultimaFechaModificacion = ultimaFechaModificacion;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public Computadora getComputadora() {
	return this.c;
	}
	
}
