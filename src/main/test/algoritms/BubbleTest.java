package algoritms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleTest extends Assert {

    Bubble bubble;

    @Before
    public void setUp() throws Exception {

        bubble = new Bubble();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testSort() throws Exception {

        int [] arrs = new int[]{5,8,2,4,9};
        assertArrayEquals(bubble.sortDown(arrs.clone()), bubble.sortUp(arrs));

    }



}
