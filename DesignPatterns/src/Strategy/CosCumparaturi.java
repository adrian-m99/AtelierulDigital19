package Strategy;

import java.util.ArrayList;
import java.util.List;

public class CosCumparaturi {

	// Lista produse
	
		List<Produs> produse;
		
		public CosCumparaturi(){
			this.produse=new ArrayList<Produs>();
		}
		
		public void addProdus(Produs produs){
			this.produse.add(produs);
		}
		
		public void removeProdus(Produs produs){
			this.produse.remove(produs);
		}
		
		public int Total(){
			int sum = 0;
			for(Produs produs : produse){
				sum += produs.getPret();
			}
			return sum;
		}
		
		public void plateste(Plata MetodaPlata){
			int cantitate = Total();
			MetodaPlata.plateste(cantitate);
		}
}
