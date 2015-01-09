import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public  class BallDecorator extends Actor
{
    int radius = 25;
    protected Ball decoratedBall;
    
    public BallDecorator()
    {
    }
    
    public BallDecorator(Ball decoratedBall)
    {
        this.decoratedBall = decoratedBall;
    }

    public Color draw()
    {
        decoratedBall.draw();
        return null;
    }

   
    
    public int getRadius()
    {
       return radius;
    }
    
    
    
}
