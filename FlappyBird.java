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
    double g = 0.5;
    double BOOST_SPEED = -5;
    
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        if(getOneIntersectingObject(Pipe.class) != null){
            
            displayGameOver();
        }
        setLocation( getX(),(int)(getY() + dy));
        if(Greenfoot.isKeyDown("up") == true){
            
           dy = BOOST_SPEED; 
        }
         
        if(dy < 10 && dy > 0){
            
        setRotation(-20);
        
        
        }
        
        else if (dy > -10 && dy < 0)
        {
            setRotation(20);
        }
           
        
        
        
        dy = dy + g;
        if(this.getY() > 400)
        {
        displayGameOver();
            
        
    }
     
}
private void displayGameOver(){
        GameOver gameOver = new GameOver();
         getWorld().addObject(gameOver,getWorld().getWidth()/2,getWorld().getHeight()/2);
        Greenfoot.stop();
    }   
}
