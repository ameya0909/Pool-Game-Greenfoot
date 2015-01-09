import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Brown extends BallDecorator
{   
    
    protected Ball decoratedBall;
    private double moveX;
    private double moveY;
    public Brown()
    {
    }

    public Brown(Ball decoratedBall)
    {
        super(decoratedBall);
    }

    public Color draw() 
    {
        return new Color(128, 0 ,0);
    }
    /*
    public void act() 
    {
        super.act();
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
