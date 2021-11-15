package physics.primitives.java;


//import components.Component;

public class Collider {
    public float width;
    public float height;
    public float x;
    public float y;
    public float getWidth()
    {
        return this.width;
    }
    public float getHeight()
    {
        return this.height;
    }
    public float getX()
    {
        return this.x;
    }
    public float getY()
    {
        return this.y;
    }
    public void setX(int amount)
    {
        this.x = amount;
    }
    public void setY(int amount)
    {
        this.y = amount;
    }
    public void update(float x, float y, float width, float height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public boolean isColliding(Collider collider)
    {
        return ((this.x < collider.x + collider.width && this.x + this.width > collider.x) &&(this.y < collider.y + collider.height && this.y + this.height > collider.y));
    }
    public boolean isCollidingTop(Collider collider)
    {
        return this.y < collider.y + collider.height && (this.x < collider.x + collider.width && this.x + this.width > collider.x);
    }
    public boolean isCollidingBottom(Collider collider)
    {
        return(this.y + height > collider.y) && (this.x < collider.x + collider.width && this.x + this.width > collider.x);
    }
    public boolean isCollidingLeft(Collider collider)
    {
        return this.x + width > collider.x && (this.y < collider.y + collider.height && this.y + this.height > collider.y);
    }
    public boolean isCollidingRight(Collider collider)
    {
        return this.x < collider.x + collider.width && (this.y < collider.y + collider.height && this.y + this.height > collider.y);
    }
    public char getDirection(Box box)
    {
        if(box.getX() < this.x)
        {
            return 'r';
        }
        else if(box.getX() > this.x)
        {
            return 'l';
        }
        else if(box.getY() < this.y)
        {
            return 'u';
        }
        else if(box.getY() > this.y)
        {
            return 'd';
        }
        else
        {
            return 'n';
        }

    }
}

