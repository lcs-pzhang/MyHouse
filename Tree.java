
/**
 * Creates an instance of a Tree.
 *
 * @author R. Gordon
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square trunk;
    private Triangle tree;
    private Triangle layer;
    private Triangle top;
    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        trunk = new Square();
        tree = new Triangle();
        layer = new Triangle();
        top = new Triangle();
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        trunk.moveVertical(200);
        trunk.changeSize(50);
        trunk.changeColor("black");
        trunk.makeVisible();
        
        tree.moveVertical(155);
        tree.moveHorizontal(40);
        tree.changeSize(80, 80);
        tree.changeColor("green");
        tree.makeVisible();
        
        layer.moveVertical(140);
        layer.moveHorizontal(40);
        layer.changeSize(60, 60);
        layer.changeColor("green");
        layer.makeVisible();
        
        top.moveVertical(130);
        top.moveHorizontal(40);
        top.changeSize(40, 40);
        top.changeColor("green");
        top.makeVisible();
        
       
        // translate the tree to the specified location
        
        
    }
    
}