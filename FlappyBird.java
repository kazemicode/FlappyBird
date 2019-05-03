import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = -15;
    double g = 1;
    double BOOST_SPEED = -15;
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), (int)(getY() + dy));
        
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
        
        if(this.getY() > 400)
        {
            GameOver gameOver = new GameOver(); 
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        
        }
    }    
}
