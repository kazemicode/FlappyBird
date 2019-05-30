import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (Oscar) 
 */
public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 1.2;
    double boostSpeed = -12;
    public void act() 
     {
       rotateFlappyBird();
       setLocation(getX(), (int)(getY() + dy));
       
       if(Greenfoot.isKeyDown("up") == true)
       {
           dy = boostSpeed;
       }        
       
       if((getY() > getWorld().getHeight()))
       {
        displayGameOver();
       }
       
       if(getOneIntersectingObject(Pipe.class) != null)
       {
        displayGameOver();        
       }
       
       dy = dy + g;
     }    
    
    private void rotateFlappyBird()
    {
        if(-5 > dy)
        {
            setRotation(0);
        }
        else if(15 < dy)
        {
            setRotation(30);
        }
        else if(-10 < dy)
        {
            setRotation(-30);
        }
    }
    
    private void displayGameOver()
        {
         GameOver gameOver = new GameOver();
         getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
         Greenfoot.stop();
        }
}
