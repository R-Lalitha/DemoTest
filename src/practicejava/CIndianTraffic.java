package practicejava;

public class CIndianTraffic implements ICentralTraffic, IContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICentralTraffic a = new CIndianTraffic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();

		CIndianTraffic at = new CIndianTraffic();
		IContinentalTraffic ct = new CIndianTraffic();
		at.walkonsymbol();
		ct.Trainsymbol();
	}

	private void walkonsymbol() {
		System.out.println(" walkon in");
	}

	@Override
	public void Trainsymbol() {
		System.out.println(" trainsymbol implementation");
	}

	@Override
	public void greenGo() {

		System.out.println(" green go implementation");
	}

	@Override
	public void redStop() {
		System.out.println(" redstop implementation");

	}

	@Override
	public void FlashYellow() {
		System.out.println(" flash implementation");
	}

}
