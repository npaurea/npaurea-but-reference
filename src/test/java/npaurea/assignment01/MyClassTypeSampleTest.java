package npaurea.assignment01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTypeSampleTest {

    @Test
    public void getLiteralValueReturnsEquals() {
        // Arrange
        MyClassType myClassType = new MyClassType();

        // Act
        String actual = myClassType.getLiteralValue();

        // Assert
        assertEquals("Literal String", actual);
    }
}
