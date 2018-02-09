package StixPhysics.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class Vector2DTest {

    //Working variables
    Vector2D vec;
    float x = 2.3f, y = 2.5f;

    @BeforeEach
    public void init(){
        //Make vector with variables
        vec = new Vector2D(x,y);
    }

    @Test
    @DisplayName("Constructor test")
    public void TestConstructor(){
        assertEquals(x, vec.x);
        assertEquals(y, vec.y);
    }

    @Test
    @DisplayName("Addition test")
    public void AdditionTest(){
        vec.add(new Vector2D(2f,2f));
        assertEquals(x + 2f, vec.x);
        assertEquals(y + 2f, vec.y);
    }

    @Test
    @DisplayName("Subtraction test")
    public void SubtractionTest(){
        vec.sub(new Vector2D(2f,2f));
        assertEquals(x - 2f, vec.x);
        assertEquals(y - 2f, vec.y);
    }

    @Test
    @DisplayName("Multiply test")
    public void MultiplyTest(){
        vec.mult(2);
        assertEquals(x * 2, vec.x);
        assertEquals(y * 2, vec.y);
    }

    @Test
    @DisplayName("Magnitute test")
    public void MagnituteTest(){
        vec = new Vector2D(3,4);
        assertEquals(5, vec.mag());
    }

    @Test
    @DisplayName("Distance test")
    public void DistanceTest(){
        Vector2D a = new Vector2D(1,1);
        Vector2D b = new Vector2D(1,2);
        assertEquals(1, a.dist(b));
    }

    @Test  
    @DisplayName("Normalise test")
    public void NormaliseTest(){
        vec.normalise();
        assertEquals(1, vec.mag());
    }


    
    
}