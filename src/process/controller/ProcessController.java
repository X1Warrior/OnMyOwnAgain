package process.controller;

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
	}
	
}
