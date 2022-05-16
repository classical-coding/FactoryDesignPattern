
public class FactoryPatternDemo {

	public static void main(String[] args) {
		GetPlanFactory planFactory = new GetPlanFactory();

		//get an object of Domestic Plan
		Plan planDomestic = planFactory.getPlan("DOMESTICPLAN");

		//Printing Domestic Plan Rate value
		System.out.println(" Domestic Plan Rate : "+planDomestic.getRate());

		//get an object of International Plan
		Plan planInternational = planFactory.getPlan("INTERNATIONALPLAN");

		//Printing International Plan Rate value
		System.out.println(" INTERNATIONAL Plan Rate : "+planInternational.getRate());

	}

}
