import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int pipeCounter = 0;
    int flappyCounter = 0;
    int pipeSpacing = getHeight()/2;
    int score = 0;
    int firstPipe = 180;
    Score scoreObj = null;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        setPaintOrder(Score.class, GameOver.class, topPipe.class, bottomPipe.class, FlappyBird.class);
        
        FlappyBird flappy = new FlappyBird();
        GameOver over = new GameOver();
        scoreObj = new Score();
        
        scoreObj.setScore(0);
        
        addObject(flappy, 100, getHeight()/2);
        addObject(scoreObj, 75, 360);
    }
    
    public void act()
    {
        pipeCounter++;
        
        if(pipeCounter % 100 == 0)
        {
            createPipes();
        }
        
            if(pipeCounter >= firstPipe)
            {
                if(flappyCounter % 100 == 0)
                  {
                    score++;
                    scoreObj.setScore(score);
                  }
                flappyCounter++;
            }
    }
    
    private void createPipes() 
// I want the height of the gap between the pipes to vary, not the pipe gap itself
    {
        topPipe top = new topPipe();
        bottomPipe bottom = new bottomPipe();
        
        GreenfootImage image = bottom.getImage(); 
        addObject(top, getWidth(), getHeight() + Greenfoot.getRandomNumber(image.getHeight()/3));
        
        GreenfootImage bottomImage = top.getImage();
        addObject(bottom, getWidth(), Greenfoot.getRandomNumber(image.getHeight())/3);
        
        
    }
}
