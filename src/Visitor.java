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
            attraction.visitAttraction(this);
        }
        public int getState(){
            return money;
        }

    public int getMoney() {
            return money;
    }

    public String getName() {
        return name;
        }

    public void setMoney(int i) {
            money = i;
    }

    public void setAttraction(Attraction attraction) {
            currentlyVisiting = attraction;
    }
}
