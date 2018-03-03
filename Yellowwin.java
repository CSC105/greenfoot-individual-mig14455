import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yellowwin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yellowwin extends World
{

    /**
     * Constructor for objects of class Yellowwin.
     * 
     */
    public Yellowwin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 432, 1); 
        mainmenu main = new mainmenu();
        addObject(main,458,382);
    }
}
