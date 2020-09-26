public class EmployeeWage{
public static final int Part_time = 1;
public static final int Full_time =2;
public static final int Rate_per_hour = 20;
public static void main(String[] args){
int Emp_hrs = 0;
int Emp_wage = 0;
int check =(int) Math.floor(Math.random() *10) % 3;
switch(check){
case Part_time: Emp_hrs = 4;
                break;
case Full_time: Emp_hrs = 8;
                break;
default: Emp_hrs = 0;
}
Emp_wage = Emp_hrs * Rate_per_hour;
System.out.println("Employee wage is "+Emp_wage);
}
}
