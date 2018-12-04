package arrays;

import java.util.Scanner;

public class stuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] scores = new double[7][3];
		double[]total=new double [7];
		double tot=0;
		double t=0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 3; j++) {
			scores[i][j] = 1 + ((int) (Math.random() * (100 - 1 + 1)));
			}
			
		}
		for (int i = 0; i < 7; i++) {
			for (int k = 0; k < 3; k++) {
				tot=tot+scores[i][k];
				total[i]=scores[i][k]+tot;
			}}
			for (int i = 0; i < 7; i++) {
				t=total[i]+t;
			}
			System.out.println(t);
		
	
}}