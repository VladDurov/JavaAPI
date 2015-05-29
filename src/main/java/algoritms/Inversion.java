package algoritms;

public class Inversion {

    int [] invetrs(int [] inver){

        for (int i = 0; i < inver.length/2; i++) {
            swap(inver, i);
        }
        return inver;
    }

    private void swap(int[] inver, int i) {
        int tmp = inver[inver.length-1-i];
        inver[inver.length-1-i] = inver[i];
        inver[i] = tmp;
    }


    int [] invertFromCenter(int [] inver){

        int center = inver.length/2;
        int ost = inver.length%2;
        for (int i = center; i > 0; i--) {
            int tmp = inver[i-1];
            inver[i-1] = inver[center+ost];
            inver[center+ost] = tmp;
            center++;
        }

        return inver;

    }


}
