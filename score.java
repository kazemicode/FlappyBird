import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class score extends Actor
{
    
    public score() {
        GreenfootImage newImage = new GreenfootImage(100, 50);
        
        setImage(newImage);
        
    }
    
    public void setscore(int Score) {
        GreenfootImage newImage = getImage();
        newImage.clear();
        
        Font f = new Font("Comic Sans MS",  40);
        newImage.setFont(f);
        
        Color c = new Color(127, 127, 127, 0);
        
        newImage.setColor(c);
        newImage.fill();
        newImage.setColor(Color.BLACK);
        newImage.drawString("" + Score, 30, 30);
        setImage(newImage);
        
        
        
    }
}
