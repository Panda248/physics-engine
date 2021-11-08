package physics.primitives.java;


import org.w3c.dom.css.Rect;
import org.joml.Vector2f;
import physics.rigidbody.java.Rigidbody;

import java.util.Vector;

public class Circle {
    private final float radius = 10f;
    private       float x      = 100f;
    private float y      = 100f;
    private float xVel;
    private float yVel;
    private float accel  = 1f;

    private final Rigidbody body = null;

    public float getRadius() {
        return this.radius;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getXVel() {
        return this.xVel;
    }

    public float getYVel() {
        return this.yVel;
    }

    public float getAccel() {
        return this.accel;
    }

    public void setX(float amount) {
        this.x = amount;
    }

    public void setY(float amount) {
        this.y = amount;
    }

    public void setAccel(float amount) {
        this.accel = amount;
    }

    public void setXVel(float amount) {
        this.xVel = amount;
    }

    public void setYVel(float amount) {
        this.yVel = amount;
    }

    public void createCollider() {
        ColliderCircle x = new ColliderCircle();
        x.setX(this.x);
        x.setY(this.y);
        x.setRadius(this.radius);
    }

    public Vector2f getCenter() {
        return body.getPosition();
    }
}
