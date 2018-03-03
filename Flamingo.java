import greenfoot.*; 
public class Flamingo extends Actor
{
    private int ySpeed;
    private int img;
    private int direction;
    private int lives;
    private int onGround;
    private boolean isJump;
    private boolean spaceDown;
    private static int fireRate = 5;
    GreenfootImage[] rightImage = new GreenfootImage[36];
    GreenfootImage[] leftImage = new GreenfootImage[36];

    public Flamingo() 
    {
        isJump = true;
        GreenfootImage myImage = getImage();
        lives = 3;
        onGround = 375;

        for(int i=0 ; i<36 ; i++){
            rightImage[i] = new GreenfootImage("Pink/Flamingo"+(i+1)+".png");
            leftImage[i] = new GreenfootImage("Pink/Flamingo"+(i+1)+".png");
            rightImage[i].scale(40,50);
            leftImage[i].scale(40,50);
            leftImage[i].mirrorHorizontally();
        }
        setImage(leftImage[0]);
    }
    private int speed = 4;

    public int getDirection(){
        return direction;
    }

    public void act() {

        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+3,getY());
            img += 1;
            direction = 1;
        }
        if (Greenfoot.isKeyDown("a"))
        { 
            setLocation(getX()-3,getY());
            img += 1;
            direction = -1;
        }
        if(Greenfoot.isKeyDown("w")){
            jump();
            Greenfoot.playSound("jump.wav");
        }
        if(spaceDown != Greenfoot.isKeyDown("SPACE")){
            fireRate--;
            if(fireRate == 0){
                shooting();
                fireRate = 5;
                if(direction == 1){
                    setLocation(getX()-5,getY());
                }if(direction == -1){
                    setLocation(getX()+5,getY());
                }
            }
            spaceDown = !spaceDown;
            // Greenfoot.playSound("fish.wav");
        }
        if(this.isTouching(LeftFishForYellow.class)){
            removeTouching(LeftFishForYellow.class);
            setLocation(getX()-10, getY());
            lives--;
            if(lives == 0){
                Yellowwin result = new Yellowwin();
                Greenfoot.setWorld(result); 
                Greenfoot.playSound("over.wav");
            }
        }
        if(this.isTouching(RightFishForYellow.class)){
            removeTouching(RightFishForYellow.class);
            setLocation(getX()+10, getY());
            lives--;
            if(lives == 0){
                Yellowwin result = new Yellowwin();
                Greenfoot.setWorld(result);
                Greenfoot.playSound("over.wav");
            }
        }
        fall();
        if(img >= 36)img -= 36;
        if(img < 0)img +=36;
        if(direction == 1){setImage(rightImage[img]);}
        else{setImage(leftImage[img]);
        }
    }

    public void jump(){
        if(getY() >= 110){
            ySpeed = -5;
            //  System.out.println("ySpeed is" + ySpeed);
            //System.out.println("Y while jump" + getY());
        }
        else{
            //cannot jump
        }

    }

    public void jumpOnBlock(){

        int BlockY = getWorld().getObjects(Blocks.class).get(0).getY();
        for(int i = 0; i < 30; i++) {
            Actor Blocks = getOneObjectAtOffset(i,-20, Blocks.class);
            Actor Blocks2 = getOneObjectAtOffset(i,0, Blocks.class);
            if(Blocks2 != null){
                onGround = BlockY-60;
                isJump = true;
                setLocation(getX(),onGround);
                break;
            }
            else if(Blocks != null) {
                onGround = 375;
                isJump = true;
                setLocation(getX(),onGround);
                break;
            }
        }
    }

    public void fall(){
        setLocation(getX(),getY() + ySpeed);
        if(isTouching(Blocks.class)){
            jumpOnBlock();
            if(getY() <= onGround+10 && isJump){ // in the air
                ySpeed += 1;
                //jumpOnBlock();
                isJump = true;
            }
            else if (getY() >= onGround+40){

                ySpeed += 1;
                isJump = false;
            }
            else if (getY() > onGround) { //fix bug stuck ditem
                ySpeed = 0;
            }
        }
        else {
            if(getY() >= 375){
                ySpeed = 0;
                setLocation(getX(),375);
                isJump = true;
            }
            else { //in the air
                ySpeed += 1;
                isJump = true;
                //System.out.println("OnGround 2 + " + onGround);
            }
        }
    }

    public void shooting(){
        //getWorld().addObject(new RightFishForPink(),getX()+20,getY()-15);
        if(direction == 1){ //face to right
            getWorld().addObject(new RightFishForPink(),getX()+20,getY()-15);
        }
        if (direction == -1) { //face to left
            getWorld().addObject(new LeftFishForPink(),getX()-20,getY()-15);
        }
        Greenfoot.playSound("shoot.wav");
    }

    public int getLives(){
        return lives;
    }

    public void countLives(){
        lives--;
    }

    public void checkBlock() {
        for(int i = 0; i < 30; i++) {
            Actor Blocks = getOneObjectAtOffset(0,i-5, Blocks.class);
            if(Blocks != null) { 
                System.out.println("Block is not empty");
                setLocation(Blocks.getX(), Blocks.getY());
                break;
            }
            // System.out.println("Block is empty");
            /*Actor Blocks = getOneObjectAtOffset(0,i-5, Blocks.class);
            if(cloudyL != null) {
            setLocation(cloudyL.getX(), cloudyL.getY());
            break;
            }*/
        }
    }

}