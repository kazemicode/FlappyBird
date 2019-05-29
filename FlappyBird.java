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
    double BOOST_SPEED = -8;
    int counter = 1;
   
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation( getX(), (int)getY() + (int) dy );
        
    if (getOneIntersectingObject(Bottompipe.class)  != null) {
        GameOver gameOver = new GameOver ();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            
            
            Greenfoot.stop();
        
    }    
        
        if (Greenfoot.isKeyDown("up") == true) {
            dy = BOOST_SPEED;
    }
    
    if (dy > -10 && dy< 10)  {
        setRotation(-25);

        
    }
    dy = dy + g;
    
     if(this.getY() > 400)
        {
            GameOver gameOver = new GameOver ();
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            
            
            Greenfoot.stop();

        }
    }    
    
     
}


