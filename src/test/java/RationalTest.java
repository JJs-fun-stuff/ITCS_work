import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }

    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
    }

    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }
    @Test
    public void testEqual() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertEquals(true, x.equals(y));
    }

    @Test
    public void testToString() {
        try {
            Rational r1 = new Rational(3,4);
            Assert.assertEquals("3/4", r1.toString());
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }

    @Test
    public void testToCompareShouldBeLessThan() {
        try {
            Rational r1 = new Rational(1,4);
            Rational r2 = new Rational(4,4);
            Assert.assertEquals(-1, r1.compareTo(r2));
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }
    @Test
    public void testToCompareShouldBeMoreThan() {
        try {
            Rational r1 = new Rational(3,4);
            Rational r2 = new Rational(1,4);
            Assert.assertEquals(1, r1.compareTo(r2));
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }
}
