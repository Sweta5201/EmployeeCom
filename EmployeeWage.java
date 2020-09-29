public class EmployeeWage{
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
               
                private final String company;
	        private final int empRatePerHr;
	        private final int noOfDays;
	        private final int maxHrsPerMonth;
	        private int totalWage;
		
                public EmployeeWage(String company, int empRatePerHr, int noOfDays, int maxHrsPerMonth){
                      this.company = company;
                      this.empRatePerHr = empRatePerHr;
                      this.noOfDays = noOfDays;
                      this.maxHrsPerMonth = maxHrsPerMonth;
                }
                public void calcEmpWage(){
			int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
			while(totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < noOfDays){
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
		        totalWage = totalEmpHrs * empRatePerHr;
		}
               
                @Override
                public String toString(){
                     return "Total Employee Wage for company " + company +" is " + totalWage;
                }

		public static void main(String[] args){
                     EmployeeWage airtel = new EmployeeWage("Airtel",20, 20, 100);
	             EmployeeWage jio = new EmployeeWage("Jio",20, 18, 90);
                     airtel.calcEmpWage();
                     System.out.println(airtel);
                     jio.calcEmpWage();
                     System.out.println(jio);
		}
        }
