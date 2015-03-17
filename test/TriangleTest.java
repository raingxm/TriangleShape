import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void shouldHasWidthAsTriangle() {
        Triangle triangle = new Triangle(3, 5);
        assertThat(triangle.getWidth(), is(3.0));
        assertThat(triangle.getHeight(), is(5.0));
    }

    @Test
    public void shouldDoubleOkAsTriangle() {
        Triangle triangle = new Triangle(2.0, 3.2);
        assertThat(triangle.getWidth(), is(2.0));
        assertThat(triangle.getHeight(), is(3.2));
    }

    @Test
    public void shouldCalculateAreaAsTriangle() {
        Triangle triangle = new Triangle(2, 10);
        assertThat(triangle.calculateArea(), is(20.0));
    }

    @Test
    public void shouldCalculatePerimeterAsTriangle() {
        Triangle triangle = new Triangle(3, 7);
        assertThat(triangle.calculatePerimeter(), is(20.0));
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenWidthOrHeightBeNegativeNum() {
        Triangle triangle = new Triangle(-2.3, 8);
    }

    @Test
    public void shouldSquareIsSpecialTriangle() {
        Triangle triangle = new Triangle(5);
        assertThat(triangle.getWidth(), is(5.0));
        assertThat(triangle.getHeight(), is(5.0));
    }
}