package taxes;

public class Runnner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salary = 80000;

		Tax_Processor clac = new Tax_Processor();

		System.out.println(clac.salaryTaxPercentage(salary) + "% tax on your income");
		System.out.println("£" + clac.salaryTaxAmount(salary) + " is the amount you will be taxed");
	}

}
