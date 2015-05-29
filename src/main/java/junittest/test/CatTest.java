package junittest.test;

import junittest.Cat;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;


public class CatTest extends Assert{

    protected int a = 5;

    @Test
    public void catRun(){

        Cat cat = new Cat("w");

        assertEquals(a*a, cat.run());

    }


    @Test
    public void newArrayListsHaveNoElements() {

        ArrayList<String> n = new ArrayList<String>();
        n.add("eewde");
        assertThat(n.size(), is(1));
    }


}
