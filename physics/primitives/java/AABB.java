package physics.primitives.java;

//import org.newdawn.slick.geom.Vector2f;
import org.joml.Vector2f;
public class AABB {
    private Vector2f center = new Vector2f();
    private Vector2f size = new Vector2f();

    public AABB(Vector2f min, Vector2f max){
        this.size = new Vector2f(max).sub(min);
        //this.center = new Vector2f(min).add(mul(0f, 0.5f));
    }
}
