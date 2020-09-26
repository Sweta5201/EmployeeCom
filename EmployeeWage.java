public class EmployeeWage{
public static final int Part_time = 1;
public static final int Full_time =2;
public static final int Rate_per_hour = 20;
public static final int Working_days = 20;
public static final int max_hrs_in_month = 100;
public static void main(String[] args){
int Emp_hrs = 0;
int Emp_wage = 0;
int Total_wage = 0;
int totalhrs = 0;
int totalworkingdays=0;
while(totalhrs <= max_hrs_in_month && totalworkingdays < Working_days)
{
totalworkingdays++;
int check =(int) Math.floor(Math.random() *10) % 3;
switch(check){
case Part_time: Emp_hrs = 4;
                break;
case Full_time: Emp_hrs = 8;
                break;
default: Emp_hrs = 0;
}
totalhrs+=Emp_hrs;
System.out.println("Days : "+totalworkingdays +" Hours : "+Emp_hrs);
}
Total_wage = totalhrs * Rate_per_hour;
System.out.println("Total Employee wage is "+Total_wage);
}
}
