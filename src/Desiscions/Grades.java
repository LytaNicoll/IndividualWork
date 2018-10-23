package Desiscions;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1;
		System.out.println("What is your salary??");
		Scanner input = new Scanner(System.in);
		num = input.nextDouble();
		if (num <= 20000) {
			System.out.println("You are a worker");
		} else {
			if (num <= 40000) {
				System.out.println("You are a Manager");
			} else {
				if (num <= 100000) {
					System.out.println("You are a CEO");
				} else {
					System.out.println("You are an owner");
				}
			}
		}

	}

}
