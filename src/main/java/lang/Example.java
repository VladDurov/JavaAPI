package lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {



    public static void main(String[] args) {

        List<Bicycle> bicycles = new ArrayList<Bicycle>();
        bicycles.add(new Bike(30, 4));
        bicycles.add(new SnowBike(60, 2));
        bicycles.add(new Bike(40, 1));
        bicycles.add(new SnowBike(20, 3));

        Collections.sort(bicycles, Bicycle.BicycleComparator);

        for (Bicycle bicycle :bicycles) {
            System.out.println(bicycle);
        }


    }





}
