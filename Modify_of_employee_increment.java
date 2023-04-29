package Project_1;

import java.util.Scanner;

class Employee_namee
{
	 void Employee_names(int expe,String noim,int incentives,int basicsalary,String jobrole,int graduate) 
	{
		 
		 int total_salary=(incentives*expe)+basicsalary;

		 if(expe>=5)
			{ System.out.println("Hi "+noim+"!!!");
			 System.out.println("Per year Incentive of "+jobrole+" → "+incentives);
			 System.out.println("Your Basic Salary is → "+basicsalary);
			 System.out.println("Your incentive of "+expe+" years is → "+(incentives*expe));
			 System.out.println("😉😁Congrats😉😁");
			 System.out.println("😉😁🤗Then You are "+expe+" years graduated in Our Organization😉😁🤗"
			 		+"\n😁🤗So graduated Incentives "+(graduate*expe)+" will upgrade in your Next month Salary😁🤗");
			 System.out.println("And Your Increment Salary  is → "+(total_salary+(graduate*expe)));
			 
			}
		 else
		 { System.out.println("Hi "+noim+"!!!");
		 System.out.println("Per year Incentives of "+jobrole+" is → "+incentives);
		 System.out.println("Your Basic Salary is → "+basicsalary);
		 System.out.println("Your incentive of "+expe+" years is → "+(incentives*expe));
		 	System.out.println("Congrats! You Got "+expe+" Years Experience in our Organization");
			System.out.println("😉😁 "+(5-expe)+" Years Goes to Your Graduation 😉😁");
			System.out.println("!!😉WoW😉!!"
			 		+ "\nYour Next Month Increment Salary is → "+total_salary);
			
		 }
		 System.out.println("😁🤗!Thank You!😁🤗 For Visiting  My Page😁");
	}
	 }


public class Modify_of_employee_increment {

	public static void main(String[] args) {
		
System.out.println("*********************** → → Employee Increment Page ← ← ************************");
		
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee Name: ");
	String name=sc.nextLine();
	System.out.println("Job Role:"
			+ "\n Developer → © ← "
			+ "\n Telecaller → ☎ ←"
			+ "\n Manager → 🤵 ←"
			+ "\n Accounts→ 📝←"
			+ "\n Human Resources(HR)→ 👨‍✈️ ←"
			+ "\n Maintenance → 👨‍ ←"
			+ "\n Enter Here: ");
	String role=sc.nextLine();
	System.out.println("Enter the Experience: ");
     int Exp=sc.nextInt();
//
     
     Employee_namee obj=new Employee_namee();
     String subname="Developer";
 	boolean role1=(subname.equals(role));
 	String subname1="Telecaller";
 	boolean role2=(subname1.equals(role));
 	String subname2="Manager";
 	boolean role3=(subname2.equals(role));
 	String subname3="Accounts";
 	boolean role4=(subname3.equals(role));
 	String subname4="HR";
 	boolean role5=(subname4.equals(role));
 	String subname5="Maintenance";
 	boolean role6=(subname5.equals(role));
 	if(role1)
 	{
 		int a_incentives=4000;
 		int a_basicsalary=30000;
 		int graduated=1000;
 		obj.Employee_names(Exp,name,a_incentives,a_basicsalary,subname,graduated);	
 	}
 	else if(role2)
 	{
 		int a_incentives=2000;
 		int a_basicsalary=20000;
 		int graduated=800;
 		obj.Employee_names(Exp,name,a_incentives,a_basicsalary,subname1,graduated);	
 	}
 	else if(role3)
 	{
 		int a_incentives=5000;
 		int a_basicsalary=50000;
 		int graduated=1000;
 		obj.Employee_names(Exp,name,a_incentives,a_basicsalary,subname2,graduated);	
 	}
 	else if(role4)
 	{
 		int a_incentives=3000;
 		int a_basicsalary=22000;
 		int graduated=1000;
 		obj.Employee_names(Exp,name,a_incentives,a_basicsalary,subname3,graduated);	
 	}
 	else if(role5)
 	{
 		int a_incentives=6000;
 		int a_basicsalary=60000;
 		int graduated=1000;
 		obj.Employee_names(Exp,name,a_incentives,a_basicsalary,subname4,graduated);	
 	}
 	else if(role6)
 	{
 		int a_incentives=3000;
 		int a_basicsalary=15000;
 		int graduated=1000;
 		obj.Employee_names(Exp,name,a_incentives,a_basicsalary,subname5,graduated);	
 	}
 	else {
 		System.out.println("**************************PLZ!.😁Check Your JOB ROLE😁*************************************"
 				+ "\n*************************😁Then Give proper Statement😁************************************");
 	}
	}

}
