import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void shouldHasWidthAsTriangle() {
        Triangle triangle = new Triangle(3, 5);
        assertThat(triangle.getWidth(), is(3));
        assertThat(triangle.getHeight(), is(5));
    }
}