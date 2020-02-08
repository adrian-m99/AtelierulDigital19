package Strategy;

public class Paypal implements Plata {

	private String email;
	private String parola;
	
	public Paypal(String email, String par){
		this.email=email;
		this.parola=par;
	}
	
	@Override
	public void plateste(int cantitate) {
		System.out.println(cantitate+ " lei platiti cu Paypal");
	}

}
