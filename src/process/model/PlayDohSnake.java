package process.model;

public class PlayDohSnake
{
	//Declaration Section
	//Data member section
	private int size;
	
	public PlayDohSnake()
	{
		this.size = 3;
		
	}
	
	public PlayDohSnake(int size)
	{
		this.size = size;
	}

	public String toString()
	{
		String description = "I am a snake, my thiccness is " + size;
		return description;
	}

}

