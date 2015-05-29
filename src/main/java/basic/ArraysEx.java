package basic;

import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {

        int[][]arrs = new int[4][4];
        int[][]arrs2 = new int[4][4];
        int[][]arrs3 = new int[4][4];

        for(int i=0;i<15;i++){
            arrs[i%4][i/4]= i+1;
            arrs2[i%4][i/4]= i+1;
            arrs3[i/4][i%4]= i+1;
            System.out.println(Math.random());
        }

        System.out.println(Arrays.deepToString(arrs));
        System.out.println(Arrays.deepToString(arrs2));
        System.out.println(Arrays.deepToString(arrs3));
        System.out.println(args.equals(arrs2));
        System.out.println(args.equals(arrs3));


        System.out.println(""+(8&6));

    }


    static void go() throws InterruptedException {


        T2 t2 = new T2();

        T1 t1 = new T1(t2);
        t1.start();


    }

}

class T1 extends Thread{

    T2 t2;

    public T1(T2 t2) {
        this.t2 = t2;
    }

    @Override
    public void run() {
        super.run();

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("t1 run");
        try {
            sleep(3000);
            System.out.println("t2 start");
            t2.start();
            t2.join();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("rrr");

    }}


class T2 extends  Thread{

    @Override
    public void run() {
        super.run();


        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("t2 run");

    }

}
