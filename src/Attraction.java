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
}
