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

    @Test
    public void testSort() throws Exception {

        int [] arrs = new int[]{9,8,5,4,2};
        int [] clone = arrs.clone();

        for (int i :arrs) {
            System.out.print(" "+i);
        }
        System.out.print("  >>  ");
        int [] arrSort = bubble.sortUp(arrs);
        System.out.print("  >>  ");
        for (int i :arrSort) {
            System.out.print(" "+i);
        }

        System.out.println();

        for (int i :clone) {
            System.out.print(" "+i);
        }
        System.out.print("  >>  ");
        int [] cloneSort = bubble.sortDown(clone);
        System.out.print("  >>  ");
        for (int i :cloneSort) {
            System.out.print(" " + i);
        }

        assertArrayEquals(cloneSort,arrSort);

    }

}
