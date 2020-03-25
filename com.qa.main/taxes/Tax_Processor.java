package taxes;

public class Tax_Processor {

	public double salaryTaxPercentage(double amount) {

		if (amount < 1500) {
			return 0;
		} else if (amount < 20000) {
			return 10;
		} else if (amount < 30000) {
			return 15;
		} else if (amount < 45000) {
			return 20;
		} else {
			return 25;
		}

	}

	public double salaryTaxAmount(double amount) {

		if (amount < 1500) {
			return 0;
		} else if (amount < 20000) {
			return amount * 0.1;
		} else if (amount < 30000) {
			return amount * 0.15;
		} else if (amount < 45000) {
			return amount * 0.2;
		} else {
			return amount * 0.25;
		}

	}

}
