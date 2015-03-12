package util;

public class Offer {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Offer(int id) {

        this.id = id;
    }

    public Offer() {

    }

    class Inner{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        Inner(String name) {

            this.name = name;
        }

//        внутренний класс
        Inner() {


        }

        public Offer getOffer(){
            return Offer.this;
        }

    }

}
