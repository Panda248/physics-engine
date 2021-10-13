package physics.primitives.java;


import org.newdawn.slick.Graphics;
//import org.newdawn.slick.geom.Vector2f;
import org.w3c.dom.css.Rect;
import org.joml.Vector2f;
import physics.rigidbody.java.Rigidbody;
import java.util.Vector;

public class Box {
    private Vector2f size = new Vector2f();
    private Vector2f halfSize = new Vector2f();
    public float width = 50f;
    public float height = 100f;
    public float x = 200f;
    public float y = 100f;
    public float xVel = 0f;
    public float yVel = 0f;
    public float accel = 1f;
    Graphics graphics = new Graphics();
    private Rigidbody rigidbody = null;
    public float getWidth()
    {
        return this.width;
    }
    public float getHeight()
    {
        return this.height;
    }

    public Box(){
        this.halfSize = new Vector2f(size).mul(0.5f);
    }

    public Box(Vector2f min, Vector2f max){
        this.size = new Vector2f(max).sub(min);
        this.halfSize = new Vector2f(max).sub(min);
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

    public Vector2f getMin(){
        return new Vector2f(this.rigidbody.getPosition()).sub(this.halfSize);
    }

    public Vector2f getMax(){
        return new Vector2f(this.rigidbody.getPosition()).add(this.halfSize);
    }

    public Vector2f[] getVertices(){
        Vector2f min = getMin();
        Vector2f max = getMax();

        Vector2f[] vertices = {new Vector2f(min.x, min.y), new Vector2f(min.x, max.y), new Vector2f(max.x, min.y), new Vector2f(max.x, max.y)};

       /*if (rigidbody.getRotation() != 0.0f){
           for (Vector2f vert : vertices){
                //TODO : implement rotation
               JMath.rotate(vert, this.rigidbody.getPosition(), this.rigidbody.getRotation());
          }
       }*/
        return vertices;
    }
}
