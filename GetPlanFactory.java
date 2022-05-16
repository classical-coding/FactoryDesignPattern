
public class GetPlanFactory {

	public Plan getPlan(String planType){  
		if(planType == null){  
			return null;  
		}  
		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
			return new DomesticPlan();  
		}   
		else if(planType.equalsIgnoreCase("INTERNATIONALPLAN")){  
			return new InternationalPlan();  
		}   
		return null;
	}

}//end of GetPlanFactory class.  
