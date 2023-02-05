package week1.day1.assignments;

public class Student {
	String studentName="Prasanth Prabhakaran";
	int rollNo=1905;
	String collegeName="PNR";
	int markScored=450;
	float cgpa=9.0f;
	
	public void Report()
	{
		System.out.println("Student Name: "+studentName);
		System.out.println("Roll No: "+rollNo);
		System.out.println("College Name: "+collegeName);
		System.out.println("Mark Scored: "+markScored);
		System.out.println("Marks in CGPA: "+cgpa);
	}
			public static void main(String[] args)
			{
				Student stu=new Student();
				stu.Report();
			}
			

}
