package StixPhysics.Physics;

import StixPhysics.Utils.Vector2D;

public class PhysicsObject {

    Vector2D velocity;
    Vector2D position;

    public PhysicsObject(float x, float y) {
        position = new Vector2D(x, y);
        velocity = new Vector2D(0, 0);
    }

    public void addForce(Vector2D force) {
        velocity.add(force);
    }

    public void update(float timeStep) {
        position.add(Vector2D.Mult(velocity, timeStep));
    }

}