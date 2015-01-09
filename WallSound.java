import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallSound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallSound extends Handler
{
    
	public void handleRequest(Request request)
	{
		if (request.getDescription()=="WALL")
		{
			Greenfoot.playSound("tock-quiet.wav");
		}
		else 
		{
			successor.handleRequest(request);
		}
	}
}

