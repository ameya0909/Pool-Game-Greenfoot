import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class BlackBall extends Ball
{
    
    int radius = 25;
    protected Ball decoratedBall;
    private double moveX;
    private double moveY;
    
    public BlackBall()
    {
    }

    public BlackBall(Ball decoratedBall)
    {
        this.decoratedBall = decoratedBall;
    }

    public Color draw()
    {
        Color c = new Color(0, 0, 0);
        GreenfootImage img = new GreenfootImage(radius * 2 + 1, radius * 2 + 1);
        img.setColor(c);
        img.fillOval(0, 0, 2*radius, 2*radius);
        setImage(img);
        return null;
    }

    
    public int getRadius()
    {
       return radius;
    }
    
    protected double getMoveX() { return moveX; }
    protected double getMoveY() { return moveY; }
    
    public double getNewX() { return getExactX() + getMoveX(); }
    public double getNewY() { return getExactY() + getMoveY(); }
    
    // If they are both close enough to zero, will be set to zero
    protected void setMove(double vx, double vy)
    {
        moveX = vx;
        moveY = vy;
        /*
        if (Math.hypot(moveX, moveY) < 0.05)
        {
            moveX = 0;
            moveY = 0;
        }
        */
    }
    public void act() 
    {
        setExactLocation(getExactX() + moveX, getExactY() + moveY);
    }
    
}
