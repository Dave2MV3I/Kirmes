public class Visitor {
    // Attribute
        private String name;
        private int money;

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
            money = money - currentlyVisiting.getPrice();
            // ODER mit durch Parameter auf Objekt zugreifen: money = money - attraction.getPrice();
        }
        public int getState(){
            return money;
        }
}
