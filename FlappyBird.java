import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = -10;
    double g = 1;
    double BOOST_SPEED = -10;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), (int)(getY() + dy));
        // collision detection -- if flappy hits a pipe, lose!
        if (getOneIntersectingObject(Pipe.class) != null)
        {
            displayGameOver();
        }
      
        
        if(this.getY() > 400)
        {
            displayGameOver();
        
        }
        
        if (Greenfoot.isKeyDown("up") == true)
        {
            dy = BOOST_SPEED;
        }
        dy = dy + g;
        
        if (dy >= -10 && dy <= 10);
        {
            setRotation(30);
            {
                if (dy >= -30 && dy <= 0)
                turn(-60);
            }
        }
    }
        
    private void displayGameOver()
    {
        GameOver gameOver = new GameOver(); 
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
    }
}    

