public class Visitor {
    // Attribute
        String name;
        int money;

    // Referenzen
        private Attraction currentlyVisiting;

    // Konstruktor
        public Visitor(String name, int money){
            this.name = name;
            this.money = money;
        }

    // Methoden
        public void visitAttraction(Attraction attraction){
            currentlyVisiting = attraction; // Muss das nötige Geld bezahlen
            money = money - attraction.getPrice();
        }
        public int getState(){
            return money;
        }
}
