package algoritms;

public class Bubble {

    public int [] sortUp(int[] arrs){

        for (int external = arrs.length; external >=0 ; external--) {
            innerCicleUp(arrs, external);
        }
        return arrs;
    }

    private void innerCicleUp(int[] arrs, int external) {
        for (int inner = 1; inner < external; inner++) {
            swap(arrs, inner);
        }
    }

    private void swap(int[] arrs, int inner) {
        if(arrs[inner-1] > arrs[inner]){
            int tmp = arrs[inner];
            arrs[inner] = arrs[inner-1];
            arrs[inner-1] = tmp;
        }
    }


    public int [] sortDown(int [] arrs){

        for (int ex = 0; ex < arrs.length; ex++) {
            for (int in = arrs.length-1; in > ex; in--) {
                swap(arrs, in);
            }
        }
        return arrs;
    }

}
