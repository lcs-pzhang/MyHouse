
/**
 * This class draws a house on screen using individual shapes.
 *
 * @author (P. Zhang)
 * @version (January 11, 2019)
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Square ground;
    private Square door;
    private Triangle window;
    private Circle glass;
    private Square post;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Square sky;
    private Circle knob;
    private Triangle box;

    /**
     * The job of a constructor is to initialize all the instance variables
     */
    public MyHouse()
    {
        // initialise instance variables
        sky = new Square();
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        ground = new Square();
        door = new Square();
        window = new Triangle();
        glass = new Circle();
        post = new Square();
        knob = new Circle();
        box = new Triangle();
        
        // invoke the method to draw the house
        drawHouse();
        
        // use the method to draw the tree
        tree1 = new Tree(300, 300);
        tree2 = new Tree(300, 50);
        tree3 = new Tree(200, 100);
       
      

        
    }

    /**
     * Draw the house for us
     */
    public void drawHouse()
    {
        // Put the sun in position
        
        sky.changeColor("blue");
        sky.changeSize(600);
        sky.moveVertical(-50);
        sky.moveHorizontal(-60);
        sky.makeVisible();
        
        sun.moveHorizontal(-80);
        sun.changeSize(100);
        sun.changeColor("yellow");
        sun.moveVertical(-80);
        sun.makeVisible();
        
        roof.moveVertical(35);
        roof.changeSize(100, 170);
        roof.changeColor("yellow");
        roof.moveHorizontal(65);
        roof.makeVisible();
        
        base.moveVertical(100);
        base.changeSize(130);
        base.changeColor("red");
        base.makeVisible();
        
        ground.moveVertical(200);
        ground.changeSize(200);
        ground.changeColor("green");
        ground.moveHorizontal(-20);
        ground.makeVisible();
        
        door.moveVertical(150);
        door.changeSize(45);
        door.changeColor("black");
        door.makeVisible();
        
        window.moveVertical(65);
        window.moveHorizontal(70);
        window.changeSize(40, 60);
        window.changeColor("blue");
        window.makeVisible();
        
        glass.moveVertical(100);
        glass.moveHorizontal(110);
        glass.changeSize(55);
        glass.changeColor("magenta");
        glass.makeVisible();
        
        post.moveVertical(160);
        post.moveHorizontal(143);
        post.changeSize(40);
        post.changeColor("black");
        post.makeVisible(); 
        
        knob.moveVertical(155);
        knob.moveHorizontal(60);
        knob.changeSize(15);
        knob.changeColor("green");
        knob.makeVisible();
        
        box.moveVertical(145);
        box.moveHorizontal(170);
        box.changeColor("red");
        box.changeSize(50, 50);
        box.makeVisible();
        
      
        
     
        
      
      
   
    }
}
