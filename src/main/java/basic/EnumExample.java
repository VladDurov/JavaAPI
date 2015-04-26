package basic;

import io.InputOutputToFile;


public class EnumExample {

    enum Manufacturer {Motorolla, Sumsung, Nokia, Apple, HTC };
    Manufacturer manufacturer;

    public static void main(String[] args) {


        for (Manufacturer manufacturer: Manufacturer.values()){
            System.out.println(manufacturer);
        }

    }

}
