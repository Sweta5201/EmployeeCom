class EmployeeWage{
public static void main(String[] args){
int is_present = 1;
int rate_per_hour = 20;
int emp_hrs = 0;
int emp_wage = 0;
int check =(int) Math.floor(Math.random() *10) % 2;
if(check == is_present)
emp_hrs = 8;
else
emp_hrs = 0;
emp_wage = emp_hrs * rate_per_hour;
System.out.println("Employee wage is "+emp_wage);
}
}
