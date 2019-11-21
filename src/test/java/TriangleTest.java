import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculateAreaTheBottomShouldNotBeZero() {

        //given
        Triangle newTriiangle = new Triangle(0,5);

        //when
        double calculatedArea = newTriiangle.calculateArea();

        //then
        assertNotEquals(0, calculatedArea, "Testing if base is zero.");
    }

    @Test
    void calculateAreaTheHeightShouldNotBeZero() {

        //given
        Triangle newTriiangle = new Triangle(5,0);

        //when
        double calculatedArea = newTriiangle.calculateArea();

        //then
        assertNotEquals(0, calculatedArea, "Testing if height is zero.");
    }
}