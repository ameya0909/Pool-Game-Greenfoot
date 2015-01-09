import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Red extends BallDecorator
{
    protected Ball decoratedBall;
    
    public Red()
    {
    }

    public Red(Ball decoratedBall)
    {
        super(decoratedBall);
    }

    public Color draw() 
    {
        return new Color(255, 0 ,0);
    }
    
    
    
}
