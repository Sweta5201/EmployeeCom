import java.util.*;

public class EmployeeWage implements ICalcEmpWage{
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;

                private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
                private Map<String, CompanyEmpWage> cMap;

                public EmployeeWage(){
                   companyEmpWageArrayList = new ArrayList<>();
                }

                public void addCompanyEmpWage(String company, int empRatePerHr, int noOfDays, int maxHrsPerMonth){
                  CompanyEmpWage ce = new CompanyEmpWage(company, empRatePerHr, noOfDays, maxHrsPerMonth);
                  companyEmpWageArrayList.add(ce);
                }

                public void calcEmpWage(){
                   for(int i = 0; i < companyEmpWageArrayList.size(); i++) {
                        CompanyEmpWage ce = companyEmpWageArrayList.get(i);
			ce.setTotalWage(this.calcEmpWage(ce));
			System.out.println(ce);
		    }
        	}
                private int calcEmpWage(CompanyEmpWage ce){
			int i=0, empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
			while(totalEmpHrs <= ce.maxHrsPerMonth && totalWorkingDays < ce.noOfDays){
				totalWorkingDays++;
				int check = (int) Math.floor(Math.random() * 10) % 3; 
				switch(check){
					case IS_PART_TIME:
						empHrs = 4;
						break;
					case IS_FULL_TIME:
						empHrs = 8;
						break;
					default:
						empHrs = 0;
				}
                                ce.dailyEmpWage.add(empHrs * ce.empRatePerHr);
				totalEmpHrs += empHrs;
				System.out.println("Days: " +  totalWorkingDays + " EmpHours: " + empHrs + " Daily wage " + ce.dailyEmpWage.get(i));
                                i++;
			}
		        return totalEmpHrs * ce.empRatePerHr;
		}

                public static void main(String[] args){ 
                     EmployeeWage emp = new EmployeeWage();
                     emp.addCompanyEmpWage("Airtel",20, 20, 100);
                     emp.addCompanyEmpWage("Jio",20, 18, 90);
                     emp.calcEmpWage();
                }

}
