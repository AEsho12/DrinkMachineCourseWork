package ac.liv.csc.comp201.control;

import ac.liv.csc.comp201.model.IMachine;

public class CoinHandlerManager {
	
	public void handleCoinsIn(IMachine machine) {
		String code=machine.getCoinHandler().getCoinKeyCode();
		System.out.println("Code is "+code);
	}
	
	/**
	 * Pay's the current balance in coins if it can be paid, this is a best try function
	 * if not enough coins then it pays the best it can do
	 */
	public void returnChange(IMachine machine) {
		machine.getDisplay().setTextString("Trying to pay change back");
		System.out.println("PAYING CHANGE!!!! balance is "+machine.getBalance());
	}

}
