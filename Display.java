package sample;

import java.util.ArrayList;

import java.util.Scanner;

// first class to contain the getter and setter method and the update Details

class Contact1 {
	int id;
	String name;
	String password;
	String mailid;
	Scanner sc1 = new Scanner(System.in);

	// getter and setter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	// constructor

	Contact1(int id, String name, String password, String mailid) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.mailid = mailid;
	}
	// return the string

	public String toString() {
		return id + " " + name + " " + password + " " + mailid;

	}

	// update user details

	public void updateDetails() {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("Enter the choice you want");
		System.out.println("1. Update the name");
		System.out.println("2. Update the password");
		System.out.println("3. Update the mailid");
		System.out.println("4. Exit");
		choice = sc1.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Enter your new name");
			String newName = sc1.next();
			this.setName(newName);
			break;
		case 2:
			System.out.println("Enter your new password");
			String newPassword = sc1.next();
			this.setName(newPassword);
			break;
		case 3:
			System.out.println("Enter your new mail id");
			String newMailId = sc1.next();
			this.setMailid(newMailId);
			break;
		case 4:
			System.out.println("Exit");

		}

	}

	// view user details
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println(" Id no :  " + id);
		System.out.println(" Your name :  " + name);
		System.out.println(" Your password :  " + password);
		System.out.println(" Your mailid  :  " + mailid);

	}

}

public class Display {

	// main function

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int id1;
		String name1;
		String password1;
		String mailid1;
		int n;
		String answer="Y";

		// creating the array list

		ArrayList<Contact1> list = new ArrayList<Contact1>();
		
		while(answer.equals("Y"))
		{

		System.out.println("Enter the choice that you want");
		System.out.println("1. Add the contacts");
		System.out.println("2. Update your information");
		System.out.println("3. View the details");
		System.out.println("4. Exit ");

		n = sc.nextInt();



		switch (n) {

		// add the user information
		case 1:
			
			

			System.out.println("Enter the id ");
			id1 = sc.nextInt();
			System.out.println("Enter the name");
			name1 = sc.next();
			System.out.println("Enter the password");
			password1 = sc.next();
			System.out.println("Enter the mailid");
			mailid1 = sc.next();
			Contact1 c = new Contact1(id1, name1, password1, mailid1);
			list.add(c);
			for (Contact1 c11 : list) {
				System.out.println(c11.id + " " + c11.name + " " + c11.password + " " + c11.mailid);
			
			}System.out.println("DO YOU WANT TO CONTINUE PRESS Y:");
			answer=sc.next();
			
           break;

		// update the user details using to pass the method

		case 2:
		
			
			System.out.println("Id no\t Name");
			for (Contact1 c22 : list) {
				System.out.println(c22.id+ " \t " +c22.name);
				System.out.println("Enter your id no");
				int newId = sc.nextInt();
				if (c22.id == newId) {
					c22.updateDetails();
				}
			}
				System.out.println("DO YOU WANT TO CONTINUE PRESS Y:");
				answer=sc.next();
			

			break;

		// display the user information

		case 3:
			int n1;
			System.out.println("enter the id that  you want to view");
			n1 = sc.nextInt();
			for (Contact1 c33 : list) {
				if (c33.id == n1) {
					c33.showDetails();

				}

			}
			System.out.println("DO YOU WANT TO CONTINUE PRESS Y:");
			answer=sc.next();
			break;

		// exit the code
		case 4:
			System.out.println("exit");
			System.out.println("DO YOU WANT TO CONTINUE PRESS Y:");
			answer=sc.next();
			break;

		}

	}
}

}