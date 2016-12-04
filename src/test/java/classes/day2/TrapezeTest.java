package classes.day2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Galek on 04.12.2016.
 */
public class TrapezeTest {
    private int a = 2, b = 3, h = 4;
    private int expected = 20;

    @Test
    public void shouldCorrectlyReturnField() {
        Trapeze trapeze = new Trapeze(a, b, h);
        Assert.assertEquals(expected, trapeze.field());
    }
}
