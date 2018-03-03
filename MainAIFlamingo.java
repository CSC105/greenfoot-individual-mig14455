import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainAIFlamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainAIFlamingo extends Actor
{
    /**
     * Act - do whatever the MainAIFlamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public MainAIFlamingo(){
        GreenfootImage img = getImage();
        img.scale(120,180);
        setImage(img);
        img.mirrorHorizontally();
        GreenfootSound backgroundMusic = new GreenfootSound("main.mp3");
        backgroundMusic.playLoop();
        backgroundMusic.setVolume(20);
    }

    public void act() 
    {
        if(isTouching(LeftFishForPink.class)){
            Greenfoot.setWorld(new GameWorld());
        }
        if(isTouching(RightFishForPink.class)){
            Greenfoot.setWorld(new GameWorld());
        }
        //if(isTouching(Flamingo.class)){
        //}
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HowToPlay());
        }
    }    

    public void showWord(){
        Greenfoot.setWorld(new GameWorld());
    }

}
