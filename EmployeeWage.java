public class EmployeeWage{
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;

                private int noOfCompany = 0;
                private CompanyEmpWage[]companyEmpWageArray;

                public EmployeeWage(){
                companyEmpWageArray = new CompanyEmpWage[5];
                }
                
                private void addCompanyEmpWage(String company, int empRatePerHr, int noOfDays, int maxHrsPerMonth){
                  companyEmpWageArray[noOfCompany] = new CompanyEmpWage(company, empRatePerHr, noOfDays, maxHrsPerMonth);
                  noOfCompany++;
                }
                private void calcEmpWage(){
                   for(int i = 0; i < noOfCompany; i++) {
			companyEmpWageArray[i].setTotalWage(this.calcEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		    }
        	}
                private int calcEmpWage(CompanyEmpWage companyEmpWage){
			int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
			while(totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.noOfDays){
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
				totalEmpHrs += empHrs;
				System.out.println("Days: " +  totalWorkingDays + " EmpHours: " + empHrs);
			}
		        return totalEmpHrs * companyEmpWage.empRatePerHr;
		}

                public static void main(String[] args){
                     EmployeeWage emp = new EmployeeWage();
                     emp.addCompanyEmpWage("Airtel",20, 20, 100);
                     emp.addCompanyEmpWage("Jio",20, 18, 90);
                     emp.calcEmpWage();
                }

         class CompanyEmpWage{
	
	        public final String company;
	        public final int empRatePerHr;
	        public final int noOfDays;
	        public final int maxHrsPerMonth;
	        public int totalWage;
	
	        public CompanyEmpWage(String company, int empRatePerHr, int noOfDays, int maxHrsPerMonth) {
		     this.company = company;
		     this.empRatePerHr = empRatePerHr;
		     this.noOfDays =noOfDays;
		     this.maxHrsPerMonth = maxHrsPerMonth;
	        }
	
	        public void setTotalWage(int totalWage) {
		      this.totalWage = totalWage;
	        }

                @Override
                public String toString(){
                     return "Total Employee Wage for company " + company +" is " + totalWage;
                }
        }
}
