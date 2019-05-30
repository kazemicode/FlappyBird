import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Oscar Leija) 
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
        
        setPaintOrder(Score.class, GameOver.class, Pipe.class, FlappyBird.class);
        
        FlappyBird mcflapface = new FlappyBird();
        GameOver over = new GameOver();
        scoreObj = new Score();
        
        scoreObj.setScore(0);
        
        addObject(mcflapface, 100, getHeight()/2);
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
    {
        Pipe topPipe = new topPipe();
        Pipe bottomPipe = new bottomPipe();
        
        GreenfootImage image = bottomPipe.getImage(); 
        addObject(topPipe, getWidth(), getHeight() + Greenfoot.getRandomNumber(image.getHeight()/3));
        
        GreenfootImage bottomImage = topPipe.getImage();
        addObject(bottomPipe, getWidth(), Greenfoot.getRandomNumber(image.getHeight())/3);
        
        
    }
}
