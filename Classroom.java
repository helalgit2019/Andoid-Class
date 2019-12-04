import java.util.Scanner;

public class Classroom{
	protected int numberofstudent=0;
	private double avgMarks=0.0;
		public Classroom (int nos){
		this.numberofstudent=nos;
		
	}	
	public double getAvgMarks(){	
		return this.avgMarks;
	}
	
	public void setAvgMarks(double avgMarks){
		this.avgMarks = avgMarks;
	}
	public double calculateMarks(double [] marks){
		double avgmarks = 0.0;
		return avgmarks;
	}
	public static void main (String[] args){
		Classroom class1 = new Classroom(5);
		double[] marks = {5.5,6.5,4.5,9.1,2.5};
		double avg = class1.calculateMarks(marks);
		
		System.out.println(avg);
	}
}
