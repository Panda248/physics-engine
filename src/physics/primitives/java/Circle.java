package physics.primitives.java;

import org.newdawn.slick.Graphics;

public class Circle {
    public float radius = 10f;
    public float x = 100f;
    public float y = 100f;
    public Graphics graphics =  new Graphics();

    public float getRadius(){
        return this.radius;
    }
    public void draw()   {
        graphics.drawOval(x,y,radius*2, radius*2);
    }
}
