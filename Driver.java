package main;

import java.util.Scanner;

import model.Employee;
import services.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialService cs=new CredentialService();
		Employee e=new Employee("harshita","kurmala");
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To IT Admin Page");
        System.out.println();	
        
        int choice=0;
        do {
        	System.out.println("Please enter the department from the following");
        	System.out.println("1.Technical");
        	System.out.println("2.Admin");
        	System.out.println("3.Human Resource");
        	System.out.println("4.Legal");
        	System.out.println("0.Logout");
        	choice =sc.nextInt();
        	switch(choice)
        	{
        	case 0:
        		choice=0;
        		cs.logOut();
        		break;
        	case 1:
        		choice=1;
        		e.setDepartment("Tech");
        		break;
        	case 2:
        		choice=2;
        		e.setDepartment("Admin");
        		break;
        	case 3:
        		choice=3;
        		e.setDepartment("HR");
        		break;
        	case 4: 
        		choice=4;
        		e.setDepartment("Legal");
        		break;
        		}
        	if(choice!=0) {
        		cs.generateEmailAddress(e);
        		cs.generatePassword(e);
        		cs.showCredentials(e);
        	}
        }while(choice!=0);
        
	}

}
