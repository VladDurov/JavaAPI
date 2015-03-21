package patterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("fist age = 18");
        subject.setState(18);
        System.out.println("second age = 21");
        subject.setState(21);
    }
}
