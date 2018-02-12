package StixPhysics.Physics;

import java.util.ArrayList;

import StixPhysics.Utils.Vector2D;

public class Physics2D{

    private ArrayList<PhysicsObject> objects;
    private Vector2D finalGravity;

    private float timeStep = 1/60; //Based on 60 fps, so 1 update every second

    public Physics2D(){
        objects = new ArrayList<PhysicsObject>();
        finalGravity = new Vector2D();
    }

    public void addObject(PhysicsObject object){
        objects.add(object);
    }

    public void removeObject(PhysicsObject object){
        objects.remove(object);
    }

    public void addGravity(Vector2D gravity){
        finalGravity.add(gravity);
    }

    public void removeGravity(Vector2D gravity){
        finalGravity.sub(gravity);
    }

    public void setGravity(Vector2D gravity){
        finalGravity = gravity.copy();
    }

    public void doStep(){

        for(PhysicsObject e : objects){
            e.addForce(Vector2D.Mult(finalGravity, timeStep));
            e.update(timeStep);
        }

    }

}