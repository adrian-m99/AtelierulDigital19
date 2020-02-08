package Strategy;

public class CardCredit implements Plata {

	private String nume;
	private String numarCard;
	private String cvv;
	private String dataExpirare;
	
	public CardCredit(String nume, String nrCard, String cvv, String dExp){
		this.nume=nume;
		this.numarCard=nrCard;
		this.cvv=cvv;
		this.dataExpirare=dExp;
	}
	
	@Override
	public void plateste(int cantitate) {
		System.out.println(cantitate + " lei platiti cu cardul. ");
	}

}
