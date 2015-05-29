package algoritms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InversionTest extends Assert {


    Inversion inversion;

    @Before
    public void setUp() throws Exception {
        inversion = new Inversion();
    }

    @Test
    public void testInvers(){

        int [] arrs = {7,4,3,8,1};
        int [] clone = arrs.clone();
        int [] inversArrs = {1,8,3,4,7};


        int [] ints = inversion.invetrs(arrs);
        for (int i : ints) {
            System.out.print(" "+i);
        }

        System.out.println();

        int [] ints_ = inversion.invertFromCenter(clone);
        for (int i : ints_) {
            System.out.print(" " + i);
        }

        assertArrayEquals(inversArrs,ints);
        assertArrayEquals(inversArrs,ints_);

    }

    @Test
    public void testInvers2(){

        int [] arrs = {7,4,3,2,8,1};
        int [] clone = arrs.clone();
        int [] inversArrs = {1,8,2,3,4,7};


        int [] ints = inversion.invetrs(arrs);
        for (int i : ints) {
            System.out.print(" "+i);
        }

        System.out.println();

        int [] ints_ = inversion.invertFromCenter(clone);
        for (int i : ints_) {
            System.out.print(" " + i);
        }

        assertArrayEquals(inversArrs,ints);
        assertArrayEquals(inversArrs,ints_);

    }

}
