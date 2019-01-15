
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

    /**
     * The job of a constructor is to initialize all the instance variables
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        ground = new Square();
        door = new Square();
        window = new Triangle();
        glass = new Circle();
        
        //invoke the method to draw the house
        drawHouse();
        
    }

    /**
     * Draw the house for us
     */
    public void drawHouse()
    {
        // Put the sun in position
        sun.moveHorizontal(-80);
        sun.changeSize(100);
        sun.changeColor("yellow");
        sun.moveVertical(-80);
        sun.makeVisible();
        
        roof.moveVertical(35);
        roof.changeSize(100, 170);
        roof.changeColor("blue");
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
        
        door.moveVertical(160);
        door.changeSize(35);
        door.changeColor("black");
        door.makeVisible();
        
        window.moveVertical(65);
        window.moveHorizontal(70);
        window.changeSize(40, 60);
        window.changeColor("yellow");
        window.makeVisible();
        
        glass.moveVertical(100);
        glass.moveHorizontal(110);
        glass.changeSize(55);
        glass.changeColor("magenta");
        glass.makeVisible();
        
     
        
      
      
   
    }
}
