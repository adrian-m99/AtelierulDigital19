package Strategy;

public class Produs {

	private String codUpc;
	private int pret;
	
	public Produs(String upc, int pret){
		this.codUpc=upc;
		this.pret=pret;
	}

	public String getCodUpc() {
		return codUpc;
	}

	public int getPret() {
		return pret;
	}
}
