import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TriangleShapeTest {
    @Test
    public void shouldHasWidthAsTriangle() {
        Triangle triangle = new Triangle(3);
        assertThat(triangle.getWidth(), is(3));
    }
}
