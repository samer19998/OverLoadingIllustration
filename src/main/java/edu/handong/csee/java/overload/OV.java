package edu.handong.csee.java.overload;

public class OV {
	
		public static void main(String[]args)
		{
			
	
	double average1 = OV.getAverage(6, 10);
	double average2 = OV.getAverage(6, 10, 14);
	char average3 = OV.getAverage('a', 'c');
	
	System.out.println("average1=" + average1);
	System.out.println("average2"+ average2);
	System.out.println("average3"+ average3);
	
	}
		
		
	public static double getAverage(double first, double second) {
		return (first + second)/2.0;
	}
		public static double getAverage(double first, double second, double third) {
			return (first+ second + third)/3.0;
		}
	public static char getAverage(char first, char second) {
		return (char)(((int)first+ (int)second)/2);
	}

}
