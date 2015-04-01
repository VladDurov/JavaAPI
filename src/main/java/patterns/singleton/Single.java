package patterns.singleton;

public class Single {

    private static Single mSingle;
    private String name;

    private Single() {}

    public static Single getInstance(){
        if(mSingle==null){
            mSingle = new Single();
        }
        return  mSingle;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {

        Single singleton = Single.getInstance();
        singleton.setName("Singleton");

        Single singleton_ = Single.getInstance();

        System.out.println(singleton.getName() + "|" + singleton_.getName());

    }

}
