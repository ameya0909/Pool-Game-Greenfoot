import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Handler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Handler extends Actor
{
    public Handler successor;
    public Handler handle;

		public void setSuccessor(Handler successor)
		{
			this.successor = successor;
		}

		public abstract void handleRequest(Request request);
}
