import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public  class SolidBall extends Ball
{
    int radius = 25;
    private double moveX;
    private double moveY;
   
    protected BallDecorator decoratedBall;
    public SolidBall()
    {
    }

    public SolidBall(BallDecorator decoratedBall)
    {
        this.decoratedBall = decoratedBall;
    }

    public Color draw()
    {
        Color c = decoratedBall.draw();
        GreenfootImage img = new GreenfootImage(radius * 2 + 1, radius * 2 + 1);
        img.setColor(c);
        img.fillOval(0, 0, 2*radius, 2*radius);
        setImage(img);
        return null;
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
   public int getRadius()
   {
       return radius;
   }
}
