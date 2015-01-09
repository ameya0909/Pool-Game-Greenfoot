import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Blue extends BallDecorator
{
    public Blue()
    {
    }

    public Blue(Ball decoratedBall)
    {
        super(decoratedBall);
    }

    public Color draw() 
    {
        return new Color(0, 0 ,255);
    }
    
   
}
