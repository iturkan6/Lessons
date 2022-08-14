import month1.lesson7.MyMath;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyMathTest {

    MyMath math;

    @BeforeEach
    public void setUp(){
        this.math = new MyMath();
    }

    @Test
    void sumTest(){
        int result1 = math.sum(2, 1);
        assertEquals(result1, 3);
    }
    @Test
    void mulTest(){
        int result1 = math.mul(3, 4);
        assertEquals(result1, 12);
    }
}
