package process.controller;
import java.util.Scanner;
import process.model.PlayDohSnake;
import process.model.PlayDohCircle;
/**
 * 
 * @author Zach Stout
 *
 */
public class ProcessController
{
	public void start()
	{
		System.out.println("i am the master of this app fear me.");
		System.out.println("dont try me son!");
	
	PlayDohCircle firstCircle = new PlayDohCircle();
	PlayDohCircle secondCircle;
	secondCircle = new PlayDohCircle();
	
	System.out.println("Look I made a circle");
	System.out.println(firstCircle);
	System.out.println(secondCircle);
	
	Scanner myScanner = new Scanner(System.in);
	System.out.println("How big of a circle do you want??");
	int circleSize = myScanner.nextInt();
	
	
	
	
	PlayDohCircle thirdCircle= new PlayDohCircle(circleSize);
	System.out.println(thirdCircle);
	
	PlayDohSnake firstSnake= new PlayDohSnake();
	PlayDohSnake secondSnake;
	secondSnake = new PlayDohSnake();
	
	System.out.println("Look I made a snake");
	System.out.println(firstSnake);
	System.out.println(secondSnake);
	}
}
