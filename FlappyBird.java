import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flapptbird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    double dy = 0;
    double g = .3;
    double BoostSpeed = -5; 
    /**
     * Act - do whatever the Flapptbird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here. 
        setLocation (getX(), (int)(getY() + dy) );
        if(Greenfoot.isKeyDown("up")==true) {
            dy= BoostSpeed; 
        }
    if(dy < 5 && dy > -5){
    setRotation(-10);
    }
    
    else if (dy < 10 && dy > -10){
    setRotation(-40);
    }
    
    else if(dy < 20 && dy > -20){
    setRotation(100);
    }
        
        if(this.getY()> 400){
        GameOver gameOver = new GameOver(); 
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop(); 
    }
     dy = dy + g;  
}    
}
