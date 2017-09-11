package process.model;

public class PlayDohPyrimid
{
	//Declaration Section
	//Data Member Section
	private int size;
	
	public PlayDohPyrimid()
	{
		this.size = 5;
		
	}
public PlayDohPyrimid(int size)
{
	this.size = size;
}
public String toString()
{
	String description = "I am a pyrimid my height is" + size;
	return description;					
}

}
