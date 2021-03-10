
public class teacher extends person {

	private String tid;
	private int salary;
	private int exp;
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	public teacher(String name, int age, int height, int weight, String tid, int salary, int exp) {
		super(name, age, height, weight);
		this.tid = tid;
		this.salary = salary;
		this.exp = exp;
	}
	
	public void show()
	{
		System.out.println("\n===================");
		System.out.println("Teacher name: "+getName());
		System.out.println("Teacher age: "+getAge());
		System.out.println("Teacher height: "+getHeight());
		System.out.println("Teacher weight: "+getWeight());
		System.out.println("Teacher ID: "+getTid());
		System.out.println("Teacher salary: "+getSalary());
		System.out.println("Teacher experience: "+getExp());
		
		
	}
	
	
}
