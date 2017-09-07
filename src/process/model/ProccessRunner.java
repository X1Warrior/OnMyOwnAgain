package process.model;

import process.controller.ProcessController;

public class ProccessRunner
{
	public static void main(String [] args)
	{
		ProcessController appController = new ProcessController();
		appController.start();
	}
}
