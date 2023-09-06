/* Write a program which takes the student name, Physics,
Chemistry and Mathematics Marks of a student as input. For each subject, marks
are out of 100. Compute the total marks of that student, percentage in each
subject and total percentage.
Print the out as “[Student Name] obtained following % of marks in PCM:
Physics: [% in Physics ], Chemistry : [% in Chem], Maths : [% in Maths]
Total : [Total %] */

import java.util.Scanner;
public class Student
{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter the name: ");
	String name = obj.nextLine();

	
	System.out.println("Enter the Physics mark: ");
	int phyMark = obj.nextInt();


	System.out.println("Enter the Chemistry Mark: ");
	int cheMark = obj.nextInt();


	System.out.println("Enter the Mathematics: ");
	int mathsMark = obj.nextInt();

	int TotalMarks = phyMark + cheMark + mathsMark;
	int Percentage = TotalMarks/3;

	System.out.println(name + " obtained following % of marks in PCM: ");
	System.out.println("Physics Mark: " + phyMark + ",");
	System.out.println("Chemistry Mark: " + cheMark + ",");
	System.out.println("Mathematics: " + mathsMark + ",");
	System.out.println("Percentage: " + Percentage + "%");
}
}
