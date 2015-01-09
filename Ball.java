import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Color;

/**
 * Write a description of class PoolBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Ball extends Actor
{
   
    private int radius;
    private double x;
    private double y;
    
    abstract Color draw();
    /*
    public void act()
    {
        setExactLocation(getExactX() + moveX, getExactY() + moveY);
    }
    */
    abstract protected double getMoveX() ;
    abstract protected double getMoveY() ;
    
    abstract public double getNewX() ;
    abstract public double getNewY() ;
    
    // If they are both close enough to zero, will be set to zero
    abstract protected void setMove(double vx, double vy) ;
    
   
    
    public String toString()
    {
        return getClass().toString() + " @ (" + getExactX() + ", " + getExactY() + ")";
    }
    
    public int getRadius()
   {
       return radius;
   }
    
    public double getExactX()
    {
        return x;
    }
    
    public double getExactY()
    {
        return y;
    }
    
    public void setExactLocation(double x, double y)
    {
        this.x = x;
        this.y = y;
        
        super.setLocation((int)x, (int) y);
    }
    
    public void setLocation(int x, int y)
    {
        setExactLocation(x, y);
    }
}
