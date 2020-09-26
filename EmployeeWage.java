class EmployeeWage{
public static void main(String[] args){
int Part_time = 1;
int Full_time =2;
int Rate_per_hour = 20;
int Emp_hrs = 0;
int Emp_wage = 0;
int check =(int) Math.floor(Math.random() *10) % 3;
if(check == Part_time)
Emp_hrs = 4;
else if(check == Full_time)
Emp_hrs = 8;
else
Emp_hrs = 0;
Emp_wage = Emp_hrs * Rate_per_hour;
System.out.println("Employee wage is "+Emp_wage);
}
}
