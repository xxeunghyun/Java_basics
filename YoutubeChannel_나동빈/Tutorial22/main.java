
public class main {

	public static void main(String[] args) {
		
		archer arc1 = new archer("궁수1", "상");
		archer arc2 = new archer("궁수1", "상");
		
		System.out.println(arc1 == arc2);
		System.out.println(arc1.equals(arc2));

	}

}
