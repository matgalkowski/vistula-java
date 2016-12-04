package classes.day2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by Galek on 04.12.2016.
 */
public class WebpageTest {
    @Test
    public void shouldBeTrueIfTitlesEqual() {
        Webpage webpage1 = new Webpage("Title 1");
        Webpage webpage2 = new Webpage("Title 1");

        Assertions.assertThat(webpage1).isEqualTo(webpage2);
    }

    @Test
    public void shouldBeFalseIfTitlesNotEqual() {
        Webpage webpage1 = new Webpage("Title 1");
        Webpage webpage2 = new Webpage("Title 2");

        Assertions.assertThat(webpage1).isNotEqualTo(webpage2);

    }
}
