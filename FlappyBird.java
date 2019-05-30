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
    double boostSpeed = -15;
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), (int)(getY() + dy));
        
        if(getOneIntersectingObject(bottomPipe.class) != null)
        {
            endGame();
        }
        if(getOneIntersectingObject(topPipe.class) != null)
        {
            endGame();
        }
            if(Greenfoot.isKeyDown("up") == true)
            {
                dy = boostSpeed;
            }
        
                if(getY() > getWorld().getHeight() || getY() < -1)
                {
                    endGame();
                }
            
        dy = dy + g;
        
    }    
    private void rotateFlappyBird()
        {
            if(-10 > dy)
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
    private void endGame()
    {
       GameOver gameOver = new GameOver();
       getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
       Greenfoot.stop();
    }
}
