package com.functional.programs;
import java.util.Scanner;
public class Distance {
	

		public static void main(String[] args) {
			//calling distance method
			distance() ;
		}
			
		public static double distance() {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter X-coordinate:");
		        int x = sc.nextInt();

		        Scanner sd = new Scanner(System.in);
		        System.out.print("Enter Y coordinate:");
		        int y = sd.nextInt();
		        
		        double result = 0;


		        result = Math.sqrt((x * x) + (y * y));
		        System.out.println("Distance of X and Y coordinate is :"+result);
		        return result;
			}

		    
		
	}

