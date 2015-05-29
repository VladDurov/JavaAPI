package lang;

import java.util.Comparator;

public abstract class Bicycle implements Comparable<Bicycle> {

    int maxSpeed;
    int number;

    public Bicycle(int maxSpeed, int number) {
        this.maxSpeed = maxSpeed;
        this.number = number;
    }

    public int compareTo(Bicycle bicycle) {
        return bicycle.maxSpeed - this.getMaxSpeed();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Bicycle.class.getSimpleName()+number+". "+maxSpeed;
    }


    public static Comparator<Bicycle> BicycleComparator
            = new Comparator<Bicycle>() {
        public int compare(Bicycle bicycle, Bicycle t1) {
            return bicycle.number-t1.getNumber();
        }
    };




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bicycle bicycle = (Bicycle) o;

        if (maxSpeed != bicycle.maxSpeed) return false;
        return number == bicycle.number;

    }

    @Override
    public int hashCode() {
        int result = maxSpeed;
        result = 31 * result + number;
        return result;
    }
}
