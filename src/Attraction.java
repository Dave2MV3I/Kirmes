public class Attraction {
    // Attribute
        private String description;
        private int price;

    // Referenzen

    // Konstruktor
        public Attraction(String description, int price){
            this.description = description;
            this.price = price;
        }

    // Methoden
        public int getPrice(){ return price; }

    public void visitAttraction(Visitor v){
            if ( v.getMoney() >= price) {
                // DANN
                v.setMoney(v.getMoney()-price);
                v.setAttraction(this);
            }
    }

    public String getName() {
            return description;
    }
}
