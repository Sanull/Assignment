package Main;

public class Calculator {

	/*
	 * Get discount value
	 * @param discount code
	 * @return discount value
	 */
	public String discValue (String code) {
			return (checkCode(code) + "%");	
	}
	
	/*
	 * Calculate price after discount
	 * @param amount before discount
	 * @return amount after discount
	 */
	public String newAmount (String amount, String code) {
		double newAmount;
		try {
			newAmount = Double.parseDouble(amount);
		}
		catch (NumberFormatException e) {
		    return ("Invalid value");
		}
		newAmount = newAmount - (newAmount * Double.parseDouble(checkCode(code)) / 100);
		return (String.format ("%.2f", newAmount));
	}
	
	/*
	 * Check promo code
	 * @param promo code
	 * @return discount percentage
	 */
	private String checkCode (String code) {
		if (code.equals("New Year")) {
			return ("5");
		}
		else if (code.equals("Lebaran")) {
			return ("10");
		}
		else if (code.equals("Harbolnas")) {
			return ("20");
		}
		else {
			return ("0");
		}
	}
}
