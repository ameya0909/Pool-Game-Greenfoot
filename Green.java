import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Green extends BallDecorator
{
    
    public Green()
    {
    }

    public Green(Ball decoratedBall)
    {
        super(decoratedBall);
    }

    public Color draw() 
    {
        return new Color(30, 100 ,10);
    }
    
    

}
