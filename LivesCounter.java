import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LivesCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LivesCounter extends Actor
{

    //int pinkLives = getWorld().getObjects(Flamingo.class).get(0).getLives();
    
    
    public LivesCounter(){
        //GreenfootImage img = getImage();
        //int pinkLives = getWorld().getObjects(Flamingo.class).get(0).getLives();
        //GreenfootImage[] pinkImage = new GreenfootImage[pinkLives];
        GreenfootImage image = new GreenfootImage("pinkLives.png");
        image.scale(25,20);
        setImage(image);
       

        //setImage(img);
    }

    public void act() 
    {
        int yellowLives = getWorld().getObjects(YellowFlamingo.class).get(0).getLives();
        setImage(new GreenfootImage("X " + yellowLives, 24, Color.BLACK, Color.WHITE));
    }    

    public void livesCount(){
        /*int pinkLives = getWorld().getObjects(Flamingo.class).get(0).getLives();
        int yellowLives = getWorld().getObjects(YellowFlamingo.class).get(0).getLives();
        System.out.println("Now Yellow::" + yellowLives);*/

    }
}
