public class EmployeeObject{
        //Constants
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

       private final String company;
       private final int empRatePerHour;
       private final int noOfWorkingDays;
       private final int maxHoursPerMonth;

       public EmployeeObject(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursPerMonth){
           this.company = company;
           this.empRatePerHour = empRatePerHour;
           this.noOfWorkingDays = noOfWorkingDays;
           this.maxHoursPerMonth= maxHoursPerMonth;
}
        //public static int calcEmpWage(String company, int empRate, int noOfDay>
                //Variables
                

        public static void main(String[] args){
            EmployeeObject dmart = new EmployeeObject("Dmart",20, 20, 100);
int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
                //Computation
                while(totalEmpHrs <= dmart.maxHoursPerMonth && totalWorkingDays < dmart.noOfWorkingDays){
                        totalWorkingDays++;
                        //check remainder with 3 because 0,1 or 2 possible
                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                        switch(empCheck){
                                case IS_FULL_TIME:
                                        empHrs = 8;
                                        break;
                                case IS_PART_TIME:
                                        empHrs = 4;
                                        break;
                                default:
                                        empHrs = 0;
                        }
                        totalEmpHrs += empHrs;
                        System.out.println("Days: " +  totalWorkingDays + " EmpHrs "+ empHrs);
                }
                int totalEmpWage = totalEmpHrs * dmart.empRatePerHour;
                System.out.println("Total Emp Wage for company is "+ totalEmpWage);
}
}
