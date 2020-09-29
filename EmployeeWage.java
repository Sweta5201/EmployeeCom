public class EmployeeWage{
     public static final int IS_PRESENT = 1;
     public static void main(String[] args){
     int check =(int) Math.floor(Math.random() *10) % 2;
     if(check == IS_PRESENT)
        System.out.println("Employee is present");
     else
        System.out.println("Employee is absent");

    }
}
