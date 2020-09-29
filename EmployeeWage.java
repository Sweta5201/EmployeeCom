public class EmployeeWage{
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;

		public static int calcEmpWage(String company, int empRate, int noOfDays, int maxHrs){
			int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
			while(totalEmpHrs <= maxHrs && totalWorkingDays < noOfDays){
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
			int totalWage = totalEmpHrs * empRate;
			System.out.println("Total Employee Wage for company "+company+" is " + totalWage);
			return totalWage;
		}

		public static void main(String[] args){
			calcEmpWage("Airtel",20, 20, 100);
	                calcEmpWage("Jio",20, 2, 10);
		}
        }
