package za.ac.cput.Single_Responsibility;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by LILO on 2016/03/24.
 */
public class TextTest {
    Text text;

    @Before
    public void setUp() throws Exception {
        text = new Text();
    }

    @Test
    public void testText() throws Exception {
        text.setText("The Amazing Spider man");
        text.setAuthor("Amy Smith");
        text.setLength(250);
        text.printText();
    }
}
