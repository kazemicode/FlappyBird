
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{
    int pipeCounter = 0;
    int flappyCounter = 0;
    int PIPE_SPACING = 100;
    int score = 0;
    int FIRST_PIPE = 240;
    Score scoreObj = null;
    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        setPaintOrder(Pipe.class, Score.class, FlappyBird.class, GameOver.class); 
        
        FlappyBird flappy = new FlappyBird();
        
        addObject(flappy, 100, getHeight()/2);
        
        scoreObj = new Score();
        scoreObj.setScore(0);
        
        addObject(scoreObj, 100, 100);
    }
    public void act()
    {
        pipeCounter++;
        
        // Create a pipe every 100 steps
        if (pipeCounter % PIPE_SPACING == 0)
        {
            createPipes();
        
        }
        
        if (pipeCounter >= FIRST_PIPE)
        {
            if (flappyCounter % 100 == 0)
            {
            score++;
            scoreObj.setScore(score);
        }
        flappyCounter++;
        }
    }
        
    private void createPipes()
        {
            Pipe TopPipe = new Pipe();
            Pipe BottomPipe = new Pipe();
        {
           Pipe top = new TopPipe();
               Pipe bottom = new BottomPipe();
           // create top pipe and place it at the top
           GreenfootImage image = bottom.getImage();
           addObject(bottom, getWidth(), getHeight() + Greenfoot.getRandomNumber(image.getHeight())/2);
           
               // create bottom pipe and place it at the bottom
           GreenfootImage bottomImage = bottom.getImage();
           addObject(top, getWidth(), Greenfoot.getRandomNumber(image.getHeight())/10 - 10);
           //pipeCounter = 0;
        }
    }
}


