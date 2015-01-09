import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BallSound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallSound extends Handler
{
	public void handleRequest(Request request)
	{
		if (request.getDescription()=="BALL")
		{
			Greenfoot.playSound("click.wav");
		}
		else 
		{
			successor.handleRequest(request);
		}
	}
}
