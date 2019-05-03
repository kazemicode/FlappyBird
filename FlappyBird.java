import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = 0;
    double g = 1.3;
    double BOOST_SPEED = -10;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX(), (int)(getY() + dy )  );
        
        //if we are touching a pipe, then Gameover
        if (getOneIntersectingObject(Pipe.class) != null)  {
             GameOver gameOver = new GameOver(); 
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            
            Greenfoot.stop();
        
        }
        if (Greenfoot.isKeyDown("up") == true) {
            dy = BOOST_SPEED;
        }
        
        if (dy >= -10 && dy >= 10); {
            // set angle to 30
            setRotation(-10);
        if (dy <= -30 && dy <= 0);{
             turn(-25);
          }
        }

        
        
        // flappy drops out of world then game over
        if (getY() > getWorld().getHeight()){
            
            
            GameOver gameOver = new GameOver(); 
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            
            Greenfoot.stop();
        
        
        }
        
        dy = dy + g;
    }    
}
