package Strategy;

public class CosCumparaturiTest {
	
	public static void main(String[] args) {
		CosCumparaturi cos = new CosCumparaturi();
		
		Produs p1 = new Produs("1234",63);
		Produs p2 = new Produs("5678",37);
		
		cos.addProdus(p1);
		cos.addProdus(p2);
		
		// Paypal
		cos.plateste(new Paypal("email", "parola"));
		
		// Card
		cos.plateste(new CardCredit("Nume", "1234567898765432", "653", "06/22"));
	}
}
