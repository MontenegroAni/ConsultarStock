import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<ItemStock> items = new ArrayList<ItemStock>();
	
	public List<ItemStock> getItems(){
		return this.items;
		}

	public void addItems(ItemStock newItems){
		this.items.add(newItems);
	}

	public List<ItemStock> consultarItemsFaltantes(int cantidadMaxima){
		List<ItemStock> resultado= new ArrayList<ItemStock>();
			for(ItemStock is: items){
				if(cantidadMaxima<is.getCantidad()){
					resultado.add(is);
				}
			}
		return resultado;
	}


}
