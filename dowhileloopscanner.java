package Pac;

import java.util.Scanner;

public class dowhileloopscanner {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int choice;
		do {
			System.out.println("/n---MENU---");
			System.out.println("1.Say HELLO");
			System.out.println("2.Show date and Time");
			System.out.println("3.Exit");
			System.out.println("enter your choice");
			choice = obj.nextInt();
			if(choice==1) {
				System.out.println("hello there");
			}
			else if(choice==2) {
				System.out.println("Current time"+java.time.LocalTime.now());
			}
			else if(choice ==3) {
				System.out.println("Good bye");
			}
			else {
				System.out.println("Invalid choice");
			}
		}while(choice!=3);
		obj.close();

	}

}
