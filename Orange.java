import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Orange extends BallDecorator
{
    
    
    public Orange()
    {
    }

    public Orange(Ball decoratedBall)
    {
        super(decoratedBall);
    }

    public Color draw() 
    {
        return new Color(230, 140 ,40);
    }
    
    
}
