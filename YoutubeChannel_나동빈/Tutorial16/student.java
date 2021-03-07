
public class student extends person{
	
	private String sid;
	private int grade;
	private double GPA;
	
	

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	
	
	public student(String name, int age, int height, int weight, String sid, int grade, double gPA) {
		super(name, age, height, weight);
		this.sid = sid;
		this.grade = grade;
		GPA = gPA;
	}

	public void show()
	{
		System.out.println("\n==============================");
		System.out.println("Student Name: "+getName());
		System.out.println("Student Age: "+getAge());
		System.out.println("Student Height: "+getHeight());
		System.out.println("Student Weight: "+getWeight());
		System.out.println("Student SID: "+getSid());
		System.out.println("Student Grade: "+getGrade());
		System.out.println("Student GPA: "+getGPA());
	}
	

}
