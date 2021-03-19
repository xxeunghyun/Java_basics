
public class archer {

	String name;
	String power;
	
	public archer(String name, String power)
	{
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj)
	{
		archer tmp = (archer) obj;
		
		if(name == tmp.name && power == tmp.power)
			
		{
			return true;
		}
		
		else
			return false;
	}
}
