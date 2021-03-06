
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		node one = new node(10, 20);
		node two = new node(30, 40);
		node result = one.getCenter(two);
		
		
		System.out.println("x: "+result.getX() + " y: "+result.getY());
	}

}
