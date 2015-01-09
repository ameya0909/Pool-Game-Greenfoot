import greenfoot.*;  
import java.awt.Color;  
  
public class GameOver extends Actor  
{  
        public GameOver()  
    {  
        setImage(new GreenfootImage("Game Over Your Score Is: " + PoolWorld.score, 48, Color.WHITE, Color.BLACK));
    }  
}
  