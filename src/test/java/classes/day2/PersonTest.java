package classes.day2;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Galek on 04.12.2016.
 */
public class PersonTest {

    @Test
    public void shouldNotWorkIfTooYoung() {
        int age = 17;
        Person person = new Person(age);
        Assert.assertFalse(person.isWorking3());
    }

    @Test
    public void shouldWorkIfProperAge() {
        int age = 35;
        Person person = new Person(age);
        Assert.assertTrue(person.isWorking3());
    }

    @Test
    public void shouldNotWorkIfTooOld() {
        int age = 69;
        Person person = new Person(age);
        Assert.assertFalse(person.isWorking3());
        Assertions.assertThat(person.isWorking());
    }
}
