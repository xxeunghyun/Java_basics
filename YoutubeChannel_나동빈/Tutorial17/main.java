
public class main {

	public static void main(String[] args) {
		
		student student1 = new student("홍길동",20,175,70,"20170101",1,4.5);
		student student2 = new student("박길동",20,177,71,"20170102",1,4.0);
		student student3 = new student("김길동",20,179,74,"20170103",1,3.5);
		
		student1.show();
		student2.show();
		student3.show();
		
		teacher teacher1 = new teacher("박땡",50,170,70,"ABC123",3000000,5);
		
		teacher1.show();
	}

}
