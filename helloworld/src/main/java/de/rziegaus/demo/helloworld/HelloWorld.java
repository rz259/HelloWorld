package de.rziegaus.demo.helloworld;

public class HelloWorld
{

	public String getGreeting()
	{
	  return "Hello World!";	
	}
	
	public static void main(String[] args)
	{
     HelloWorld app = new HelloWorld();
     String msg = app.getGreeting();
     System.out.println(msg);
		
	}

}
