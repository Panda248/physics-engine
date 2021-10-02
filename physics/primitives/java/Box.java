package physics.primitives.java;


import org.newdawn.slick.Graphics;
import org.w3c.dom.css.Rect;

public class Box {
    public float width = 50f;
    public float height = 100f;
    private float x = 200f;
    private float y = 100f;
    Graphics graphics = new Graphics();
    public float getWidth()
    {
        return this.width;
    }
    public float getHeight()
    {
        return this.height;
    }
    public void createCollider()
    {
        Collider placeHolder = new Collider();
        placeHolder.width = this.width;
        placeHolder.height = this.height;
        placeHolder.x = this.x;
        placeHolder.y = this.y;
    }
    public void draw()
    {
        graphics.drawRect(x,y,width,height);
    }



}
