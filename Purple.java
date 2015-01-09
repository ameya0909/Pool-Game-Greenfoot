import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Purple extends BallDecorator
{
    
    
    public Purple()
    {
    }

    public Purple(Ball decoratedBall)
    {
        super(decoratedBall);
    }

    public Color draw() 
    {
        return new Color(85, 10 ,150);
    }
    
    

}
