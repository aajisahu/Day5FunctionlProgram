package com.functional.programs;
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		
		//creating object of WindChill class
		new WindChill();
	}
	
		//creating constructor
	  WindChill() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature : ");
	        int temperature = sc.nextInt();

	        Scanner sd = new Scanner(System.in);
	        System.out.print("Enter wind speed : ");
	        
	        double v = sd.nextInt();
	        v = Math.pow(v, 0.16);
	        
	        double wind  = (0.4275 * temperature - 35.75) * v;
	        wind  = 35.74 + 0.6215 + wind ;
	        
	        System.out.println(wind );
	    }
}

