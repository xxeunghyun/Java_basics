
public class node {

	private int x;
	private int y;
	
	public int getX() 
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public node(int x, int y)	//초기화해주는 노드라는 생성
	{
		this.x = x;
		this.y = y;
	}
	
	public node getCenter(node other)
	{
		return new node((this.x+other.getX())/2 , (this.y+other.getY())/2);
		
	}
}
