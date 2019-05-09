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
    double BOOST_SPEED = -9;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if we are touching a pipe, then Gameover
        if (getOneIntersectingObject(Pipe.class) != null)  {
            
            displayGameOver();
        
        }
        
        setLocation( getX(), (int)(getY() + dy )  );
        if (Greenfoot.isKeyDown("up") == true) {
            dy = BOOST_SPEED;
        }
        
        if (dy >= -10 && dy <= 10);
        {
            setRotation(25);
          {
            if (dy >= -30 && dy <= 0)
             turn(-60);
          }
        }
        // flappy drops out of world then game over
        if (getY() > getWorld().getHeight())
        {
            displayGameOver();
        }    
        dy = dy + g;

    }   
       
        private void displayGameOver(){         
        GameOver gameOver = new GameOver(); 
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);   
        Greenfoot.stop();    
    } 
     
    
        
    }
    
    