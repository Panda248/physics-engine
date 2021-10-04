package physics.primitives.java;


//import org.newdawn.slick.geom.Vector2f;
import org.w3c.dom.css.Rect;
import org.joml.Vector2f;
import physics.rigidbody.java.Rigidbody;
import java.util.Vector;

public class Circle {
    public float radius = 10f;
    public float x = 100f;
    public float y = 100f;

    private Rigidbody body = null;

    public float getRadius(){
        return this.radius;
    }
    public float getX()
    {
        return this.x;
    }
    public float getY()
    {
        return this.y;
    }
    public void createCollider()
    {
        ColliderCircle x = new ColliderCircle();
        x.radius = this.radius;
        x.x = this.x;
        x.y = this.y;
    }
    public Vector2f getCenter(){
        return body.getPosition();
    }
}

