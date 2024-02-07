package ifelse_demo;

import java.util.Scanner;

public class ifelsedemo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the age of the Voter");
	int age = sc.nextInt();
	System.out.println("Voter of the age is:" +age);
	sc.close();
	if(age>=18) {
		System.out.println("Voter can casting his vote");
	}
		else {
			System.out.println("Voter can not casting his vote");
		}
	}

}

