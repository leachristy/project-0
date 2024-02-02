//Lea Christy Wiranatha's Quiz Submission

//Hi CS2400. My name is Lea WIranatha

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the Course name: ");
		String Coursename = keyboard.nextLine();
		
		System.out.println("Please enter the semester: ");
		String Semester = keyboard.nextLine();
		
		System.out.println("Please enter the score: ");
		int Score = keyboard.nextInt();
		double Score1 = Score;
		
		System.out.printf("The score of %s in %s is %.1f\n" , Coursename, Semester, Score1);
		String course = "\"" + Coursename.substring(19,23) + "\"";
		
		System.out.println(course);
		
		/*int b = 5;
		int c = 10;
		int a = b * c + 1 / 2;
		System.out.print(a);*/
		
		
	}

}
