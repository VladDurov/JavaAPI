package lang;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.mockito.Mockito.*;

public class BicycleTest extends Assert{

    @Test
    public void testCompareTo() {

        //Проверка сортировки по убыванию maxSpeed
        Bike bike = new Bike(20, 1);
        assertTrue(bike.compareTo(new Bike(100, 2))>0);

    }

    @Test
    public void testCompareTo2() {

//        Проверка сортировки по возрастанию number

        Bicycle b1 = new Bike(40, 1);
        Bicycle b2 = new SnowBike(60, 2);
        Bicycle b3 = new SnowBike(20, 3);
        Bicycle b4 = new Bike(30, 4);


        List<Bicycle> bicycles = new ArrayList<Bicycle>();
        bicycles.add(b4);
        bicycles.add(b2);
        bicycles.add(b1);
        bicycles.add(b3);

        Collections.sort(bicycles, Bicycle.BicycleComparator);

        List<Bicycle> bicycles2 = new ArrayList<Bicycle>();
        bicycles2.add(b1);
        bicycles2.add(b2);
        bicycles2.add(b3);
        bicycles2.add(b4);

        assertEquals(bicycles, bicycles2);
    }

    @Test
    public void testCompareTo3() {

        Bicycle bicycle = spy(new Bike(200,4));
        List<Bicycle> bicycles = new ArrayList<Bicycle>();

        when(bicycle.getMaxSpeed()).thenReturn(400); // программируем, что должен возвращать метод
//        when(bicycle.getNumber()).thenReturn(7); // программируем, что должен возвращать метод
        doReturn(7).when(bicycle).getNumber();

        Bicycle b1 = new Bike(40, 1);
        Bicycle b2 = new SnowBike(60, 2);


        bicycles.add(bicycle);
        bicycles.add(b1);
        bicycles.add(b2);

        Collections.sort(bicycles);

        for (Bicycle bicycle1 : bicycles) {
            System.out.println(bicycle1.getMaxSpeed() + "/" + bicycle1.getNumber());
        }




    }

}
